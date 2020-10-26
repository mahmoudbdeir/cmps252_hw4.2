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

@Tag("17")
class Record_444 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 444: FirstName is Janice")
	void FirstNameOfRecord444() {
		assertEquals("Janice", customers.get(443).getFirstName());
	}

	@Test
	@DisplayName("Record 444: LastName is Livernoche")
	void LastNameOfRecord444() {
		assertEquals("Livernoche", customers.get(443).getLastName());
	}

	@Test
	@DisplayName("Record 444: Company is Larocca, Anthony J Esq")
	void CompanyOfRecord444() {
		assertEquals("Larocca, Anthony J Esq", customers.get(443).getCompany());
	}

	@Test
	@DisplayName("Record 444: Address is 39 State St")
	void AddressOfRecord444() {
		assertEquals("39 State St", customers.get(443).getAddress());
	}

	@Test
	@DisplayName("Record 444: City is North Haven")
	void CityOfRecord444() {
		assertEquals("North Haven", customers.get(443).getCity());
	}

	@Test
	@DisplayName("Record 444: County is New Haven")
	void CountyOfRecord444() {
		assertEquals("New Haven", customers.get(443).getCounty());
	}

	@Test
	@DisplayName("Record 444: State is CT")
	void StateOfRecord444() {
		assertEquals("CT", customers.get(443).getState());
	}

	@Test
	@DisplayName("Record 444: ZIP is 6473")
	void ZIPOfRecord444() {
		assertEquals("6473", customers.get(443).getZIP());
	}

	@Test
	@DisplayName("Record 444: Phone is 203-234-8050")
	void PhoneOfRecord444() {
		assertEquals("203-234-8050", customers.get(443).getPhone());
	}

	@Test
	@DisplayName("Record 444: Fax is 203-234-0125")
	void FaxOfRecord444() {
		assertEquals("203-234-0125", customers.get(443).getFax());
	}

	@Test
	@DisplayName("Record 444: Email is janice@livernoche.com")
	void EmailOfRecord444() {
		assertEquals("janice@livernoche.com", customers.get(443).getEmail());
	}

	@Test
	@DisplayName("Record 444: Web is http://www.janicelivernoche.com")
	void WebOfRecord444() {
		assertEquals("http://www.janicelivernoche.com", customers.get(443).getWeb());
	}
}
