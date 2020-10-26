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

@Tag("37")
class Record_1114 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1114: FirstName is Dane")
	void FirstNameOfRecord1114() {
		assertEquals("Dane", customers.get(1113).getFirstName());
	}

	@Test
	@DisplayName("Record 1114: LastName is Seebach")
	void LastNameOfRecord1114() {
		assertEquals("Seebach", customers.get(1113).getLastName());
	}

	@Test
	@DisplayName("Record 1114: Company is Schnedler, Steven C Esq")
	void CompanyOfRecord1114() {
		assertEquals("Schnedler, Steven C Esq", customers.get(1113).getCompany());
	}

	@Test
	@DisplayName("Record 1114: Address is 3941 West Ln")
	void AddressOfRecord1114() {
		assertEquals("3941 West Ln", customers.get(1113).getAddress());
	}

	@Test
	@DisplayName("Record 1114: City is Stockton")
	void CityOfRecord1114() {
		assertEquals("Stockton", customers.get(1113).getCity());
	}

	@Test
	@DisplayName("Record 1114: County is San Joaquin")
	void CountyOfRecord1114() {
		assertEquals("San Joaquin", customers.get(1113).getCounty());
	}

	@Test
	@DisplayName("Record 1114: State is CA")
	void StateOfRecord1114() {
		assertEquals("CA", customers.get(1113).getState());
	}

	@Test
	@DisplayName("Record 1114: ZIP is 95204")
	void ZIPOfRecord1114() {
		assertEquals("95204", customers.get(1113).getZIP());
	}

	@Test
	@DisplayName("Record 1114: Phone is 209-463-7199")
	void PhoneOfRecord1114() {
		assertEquals("209-463-7199", customers.get(1113).getPhone());
	}

	@Test
	@DisplayName("Record 1114: Fax is 209-463-2555")
	void FaxOfRecord1114() {
		assertEquals("209-463-2555", customers.get(1113).getFax());
	}

	@Test
	@DisplayName("Record 1114: Email is dane@seebach.com")
	void EmailOfRecord1114() {
		assertEquals("dane@seebach.com", customers.get(1113).getEmail());
	}

	@Test
	@DisplayName("Record 1114: Web is http://www.daneseebach.com")
	void WebOfRecord1114() {
		assertEquals("http://www.daneseebach.com", customers.get(1113).getWeb());
	}
}
