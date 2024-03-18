package com.konfigthis.client;

import com.konfigthis.client.api.AccountAccessConsentsApi;
import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.BalancesApi;
import com.konfigthis.client.api.BeneficiariesApi;
import com.konfigthis.client.api.DirectDebitsApi;
import com.konfigthis.client.api.PartiesApi;
import com.konfigthis.client.api.ProductsApi;
import com.konfigthis.client.api.ScheduledPaymentsApi;
import com.konfigthis.client.api.StandingOrdersApi;
import com.konfigthis.client.api.TransactionsApi;

public class HsbcAccountInformationCe {
    private ApiClient apiClient;
    public final AccountAccessConsentsApi accountAccessConsents;
    public final AccountsApi accounts;
    public final BalancesApi balances;
    public final BeneficiariesApi beneficiaries;
    public final DirectDebitsApi directDebits;
    public final PartiesApi parties;
    public final ProductsApi products;
    public final ScheduledPaymentsApi scheduledPayments;
    public final StandingOrdersApi standingOrders;
    public final TransactionsApi transactions;

    public HsbcAccountInformationCe() {
        this(null);
    }

    public HsbcAccountInformationCe(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accountAccessConsents = new AccountAccessConsentsApi(this.apiClient);
        this.accounts = new AccountsApi(this.apiClient);
        this.balances = new BalancesApi(this.apiClient);
        this.beneficiaries = new BeneficiariesApi(this.apiClient);
        this.directDebits = new DirectDebitsApi(this.apiClient);
        this.parties = new PartiesApi(this.apiClient);
        this.products = new ProductsApi(this.apiClient);
        this.scheduledPayments = new ScheduledPaymentsApi(this.apiClient);
        this.standingOrders = new StandingOrdersApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
    }

}
