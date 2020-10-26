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

@Tag("0")
class Record_4867 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4867: FirstName is Bernice")
	void FirstNameOfRecord4867() {
		assertEquals("Bernice", customers.get(4866).getFirstName());
	}

	@Test
	@DisplayName("Record 4867: LastName is Greenly")
	void LastNameOfRecord4867() {
		assertEquals("Greenly", customers.get(4866).getLastName());
	}

	@Test
	@DisplayName("Record 4867: Company is Tinawi, Emad Esq")
	void CompanyOfRecord4867() {
		assertEquals("Tinawi, Emad Esq", customers.get(4866).getCompany());
	}

	@Test
	@DisplayName("Record 4867: Address is 433 N Camden Dr")
	void AddressOfRecord4867() {
		assertEquals("433 N Camden Dr", customers.get(4866).getAddress());
	}

	@Test
	@DisplayName("Record 4867: City is Beverly Hills")
	void CityOfRecord4867() {
		assertEquals("Beverly Hills", customers.get(4866).getCity());
	}

	@Test
	@DisplayName("Record 4867: County is Los Angeles")
	void CountyOfRecord4867() {
		assertEquals("Los Angeles", customers.get(4866).getCounty());
	}

	@Test
	@DisplayName("Record 4867: State is CA")
	void StateOfRecord4867() {
		assertEquals("CA", customers.get(4866).getState());
	}

	@Test
	@DisplayName("Record 4867: ZIP is 90210")
	void ZIPOfRecord4867() {
		assertEquals("90210", customers.get(4866).getZIP());
	}

	@Test
	@DisplayName("Record 4867: Phone is 310-205-6687")
	void PhoneOfRecord4867() {
		assertEquals("310-205-6687", customers.get(4866).getPhone());
	}

	@Test
	@DisplayName("Record 4867: Fax is 310-205-5607")
	void FaxOfRecord4867() {
		assertEquals("310-205-5607", customers.get(4866).getFax());
	}

	@Test
	@DisplayName("Record 4867: Email is bernice@greenly.com")
	void EmailOfRecord4867() {
		assertEquals("bernice@greenly.com", customers.get(4866).getEmail());
	}

	@Test
	@DisplayName("Record 4867: Web is http://www.bernicegreenly.com")
	void WebOfRecord4867() {
		assertEquals("http://www.bernicegreenly.com", customers.get(4866).getWeb());
	}
}
