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

@Tag("24")
class Record_2063 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2063: FirstName is Susanna")
	void FirstNameOfRecord2063() {
		assertEquals("Susanna", customers.get(2062).getFirstName());
	}

	@Test
	@DisplayName("Record 2063: LastName is Delgiudice")
	void LastNameOfRecord2063() {
		assertEquals("Delgiudice", customers.get(2062).getLastName());
	}

	@Test
	@DisplayName("Record 2063: Company is American Almond Prods Co Inc")
	void CompanyOfRecord2063() {
		assertEquals("American Almond Prods Co Inc", customers.get(2062).getCompany());
	}

	@Test
	@DisplayName("Record 2063: Address is 3108 N Alameda St")
	void AddressOfRecord2063() {
		assertEquals("3108 N Alameda St", customers.get(2062).getAddress());
	}

	@Test
	@DisplayName("Record 2063: City is Compton")
	void CityOfRecord2063() {
		assertEquals("Compton", customers.get(2062).getCity());
	}

	@Test
	@DisplayName("Record 2063: County is Los Angeles")
	void CountyOfRecord2063() {
		assertEquals("Los Angeles", customers.get(2062).getCounty());
	}

	@Test
	@DisplayName("Record 2063: State is CA")
	void StateOfRecord2063() {
		assertEquals("CA", customers.get(2062).getState());
	}

	@Test
	@DisplayName("Record 2063: ZIP is 90222")
	void ZIPOfRecord2063() {
		assertEquals("90222", customers.get(2062).getZIP());
	}

	@Test
	@DisplayName("Record 2063: Phone is 310-537-0418")
	void PhoneOfRecord2063() {
		assertEquals("310-537-0418", customers.get(2062).getPhone());
	}

	@Test
	@DisplayName("Record 2063: Fax is 310-537-6107")
	void FaxOfRecord2063() {
		assertEquals("310-537-6107", customers.get(2062).getFax());
	}

	@Test
	@DisplayName("Record 2063: Email is susanna@delgiudice.com")
	void EmailOfRecord2063() {
		assertEquals("susanna@delgiudice.com", customers.get(2062).getEmail());
	}

	@Test
	@DisplayName("Record 2063: Web is http://www.susannadelgiudice.com")
	void WebOfRecord2063() {
		assertEquals("http://www.susannadelgiudice.com", customers.get(2062).getWeb());
	}
}
