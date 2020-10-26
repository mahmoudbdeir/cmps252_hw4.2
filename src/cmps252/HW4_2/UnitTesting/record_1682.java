package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("26")
class Record_1682 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1682: FirstName is Brittney")
	void FirstNameOfRecord1682() {
		assertEquals("Brittney", customers.get(1681).getFirstName());
	}

	@Test
	@DisplayName("Record 1682: LastName is Coyco")
	void LastNameOfRecord1682() {
		assertEquals("Coyco", customers.get(1681).getLastName());
	}

	@Test
	@DisplayName("Record 1682: Company is Biomol Research Labs Inc")
	void CompanyOfRecord1682() {
		assertEquals("Biomol Research Labs Inc", customers.get(1681).getCompany());
	}

	@Test
	@DisplayName("Record 1682: Address is 111 Continental Dr  #-102")
	void AddressOfRecord1682() {
		assertEquals("111 Continental Dr  #-102", customers.get(1681).getAddress());
	}

	@Test
	@DisplayName("Record 1682: City is Newark")
	void CityOfRecord1682() {
		assertEquals("Newark", customers.get(1681).getCity());
	}

	@Test
	@DisplayName("Record 1682: County is New Castle")
	void CountyOfRecord1682() {
		assertEquals("New Castle", customers.get(1681).getCounty());
	}

	@Test
	@DisplayName("Record 1682: State is DE")
	void StateOfRecord1682() {
		assertEquals("DE", customers.get(1681).getState());
	}

	@Test
	@DisplayName("Record 1682: ZIP is 19713")
	void ZIPOfRecord1682() {
		assertEquals("19713", customers.get(1681).getZIP());
	}

	@Test
	@DisplayName("Record 1682: Phone is 302-731-7623")
	void PhoneOfRecord1682() {
		assertEquals("302-731-7623", customers.get(1681).getPhone());
	}

	@Test
	@DisplayName("Record 1682: Fax is 302-731-5215")
	void FaxOfRecord1682() {
		assertEquals("302-731-5215", customers.get(1681).getFax());
	}

	@Test
	@DisplayName("Record 1682: Email is brittney@coyco.com")
	void EmailOfRecord1682() {
		assertEquals("brittney@coyco.com", customers.get(1681).getEmail());
	}

	@Test
	@DisplayName("Record 1682: Web is http://www.brittneycoyco.com")
	void WebOfRecord1682() {
		assertEquals("http://www.brittneycoyco.com", customers.get(1681).getWeb());
	}
}
