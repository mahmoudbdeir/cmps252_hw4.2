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

@Tag("21")
class Record_2462 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2462: FirstName is Lily")
	void FirstNameOfRecord2462() {
		assertEquals("Lily", customers.get(2461).getFirstName());
	}

	@Test
	@DisplayName("Record 2462: LastName is Tavernier")
	void LastNameOfRecord2462() {
		assertEquals("Tavernier", customers.get(2461).getLastName());
	}

	@Test
	@DisplayName("Record 2462: Company is Toms House Of Hydraulics Inc")
	void CompanyOfRecord2462() {
		assertEquals("Toms House Of Hydraulics Inc", customers.get(2461).getCompany());
	}

	@Test
	@DisplayName("Record 2462: Address is 18028 Ventura Blvd")
	void AddressOfRecord2462() {
		assertEquals("18028 Ventura Blvd", customers.get(2461).getAddress());
	}

	@Test
	@DisplayName("Record 2462: City is Encino")
	void CityOfRecord2462() {
		assertEquals("Encino", customers.get(2461).getCity());
	}

	@Test
	@DisplayName("Record 2462: County is Los Angeles")
	void CountyOfRecord2462() {
		assertEquals("Los Angeles", customers.get(2461).getCounty());
	}

	@Test
	@DisplayName("Record 2462: State is CA")
	void StateOfRecord2462() {
		assertEquals("CA", customers.get(2461).getState());
	}

	@Test
	@DisplayName("Record 2462: ZIP is 91316")
	void ZIPOfRecord2462() {
		assertEquals("91316", customers.get(2461).getZIP());
	}

	@Test
	@DisplayName("Record 2462: Phone is 818-705-0051")
	void PhoneOfRecord2462() {
		assertEquals("818-705-0051", customers.get(2461).getPhone());
	}

	@Test
	@DisplayName("Record 2462: Fax is 818-705-6608")
	void FaxOfRecord2462() {
		assertEquals("818-705-6608", customers.get(2461).getFax());
	}

	@Test
	@DisplayName("Record 2462: Email is lily@tavernier.com")
	void EmailOfRecord2462() {
		assertEquals("lily@tavernier.com", customers.get(2461).getEmail());
	}

	@Test
	@DisplayName("Record 2462: Web is http://www.lilytavernier.com")
	void WebOfRecord2462() {
		assertEquals("http://www.lilytavernier.com", customers.get(2461).getWeb());
	}
}
