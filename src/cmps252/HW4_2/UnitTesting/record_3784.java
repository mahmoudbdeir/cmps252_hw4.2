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

@Tag("48")
class Record_3784 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3784: FirstName is Brent")
	void FirstNameOfRecord3784() {
		assertEquals("Brent", customers.get(3783).getFirstName());
	}

	@Test
	@DisplayName("Record 3784: LastName is Faur")
	void LastNameOfRecord3784() {
		assertEquals("Faur", customers.get(3783).getLastName());
	}

	@Test
	@DisplayName("Record 3784: Company is Feuerback, Jerald Esq")
	void CompanyOfRecord3784() {
		assertEquals("Feuerback, Jerald Esq", customers.get(3783).getCompany());
	}

	@Test
	@DisplayName("Record 3784: Address is 400 Abc Blvd")
	void AddressOfRecord3784() {
		assertEquals("400 Abc Blvd", customers.get(3783).getAddress());
	}

	@Test
	@DisplayName("Record 3784: City is Gallatin")
	void CityOfRecord3784() {
		assertEquals("Gallatin", customers.get(3783).getCity());
	}

	@Test
	@DisplayName("Record 3784: County is Sumner")
	void CountyOfRecord3784() {
		assertEquals("Sumner", customers.get(3783).getCounty());
	}

	@Test
	@DisplayName("Record 3784: State is TN")
	void StateOfRecord3784() {
		assertEquals("TN", customers.get(3783).getState());
	}

	@Test
	@DisplayName("Record 3784: ZIP is 37066")
	void ZIPOfRecord3784() {
		assertEquals("37066", customers.get(3783).getZIP());
	}

	@Test
	@DisplayName("Record 3784: Phone is 615-451-2842")
	void PhoneOfRecord3784() {
		assertEquals("615-451-2842", customers.get(3783).getPhone());
	}

	@Test
	@DisplayName("Record 3784: Fax is 615-451-5741")
	void FaxOfRecord3784() {
		assertEquals("615-451-5741", customers.get(3783).getFax());
	}

	@Test
	@DisplayName("Record 3784: Email is brent@faur.com")
	void EmailOfRecord3784() {
		assertEquals("brent@faur.com", customers.get(3783).getEmail());
	}

	@Test
	@DisplayName("Record 3784: Web is http://www.brentfaur.com")
	void WebOfRecord3784() {
		assertEquals("http://www.brentfaur.com", customers.get(3783).getWeb());
	}
}
