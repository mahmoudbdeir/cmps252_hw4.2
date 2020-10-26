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

@Tag("10")
class Record_3931 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3931: FirstName is Queen")
	void FirstNameOfRecord3931() {
		assertEquals("Queen", customers.get(3930).getFirstName());
	}

	@Test
	@DisplayName("Record 3931: LastName is Sovey")
	void LastNameOfRecord3931() {
		assertEquals("Sovey", customers.get(3930).getLastName());
	}

	@Test
	@DisplayName("Record 3931: Company is Jasper Cnty Sand & Grvl Co Inc")
	void CompanyOfRecord3931() {
		assertEquals("Jasper Cnty Sand & Grvl Co Inc", customers.get(3930).getCompany());
	}

	@Test
	@DisplayName("Record 3931: Address is 6300 Wilshire Blvd  #-9000")
	void AddressOfRecord3931() {
		assertEquals("6300 Wilshire Blvd  #-9000", customers.get(3930).getAddress());
	}

	@Test
	@DisplayName("Record 3931: City is Los Angeles")
	void CityOfRecord3931() {
		assertEquals("Los Angeles", customers.get(3930).getCity());
	}

	@Test
	@DisplayName("Record 3931: County is Los Angeles")
	void CountyOfRecord3931() {
		assertEquals("Los Angeles", customers.get(3930).getCounty());
	}

	@Test
	@DisplayName("Record 3931: State is CA")
	void StateOfRecord3931() {
		assertEquals("CA", customers.get(3930).getState());
	}

	@Test
	@DisplayName("Record 3931: ZIP is 90048")
	void ZIPOfRecord3931() {
		assertEquals("90048", customers.get(3930).getZIP());
	}

	@Test
	@DisplayName("Record 3931: Phone is 323-655-7384")
	void PhoneOfRecord3931() {
		assertEquals("323-655-7384", customers.get(3930).getPhone());
	}

	@Test
	@DisplayName("Record 3931: Fax is 323-655-4656")
	void FaxOfRecord3931() {
		assertEquals("323-655-4656", customers.get(3930).getFax());
	}

	@Test
	@DisplayName("Record 3931: Email is queen@sovey.com")
	void EmailOfRecord3931() {
		assertEquals("queen@sovey.com", customers.get(3930).getEmail());
	}

	@Test
	@DisplayName("Record 3931: Web is http://www.queensovey.com")
	void WebOfRecord3931() {
		assertEquals("http://www.queensovey.com", customers.get(3930).getWeb());
	}
}
