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

@Tag("2")
class Record_833 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 833: FirstName is Brian")
	void FirstNameOfRecord833() {
		assertEquals("Brian", customers.get(832).getFirstName());
	}

	@Test
	@DisplayName("Record 833: LastName is Kramarczyk")
	void LastNameOfRecord833() {
		assertEquals("Kramarczyk", customers.get(832).getLastName());
	}

	@Test
	@DisplayName("Record 833: Company is Endyne Inc")
	void CompanyOfRecord833() {
		assertEquals("Endyne Inc", customers.get(832).getCompany());
	}

	@Test
	@DisplayName("Record 833: Address is 9245 Reseda Blvd")
	void AddressOfRecord833() {
		assertEquals("9245 Reseda Blvd", customers.get(832).getAddress());
	}

	@Test
	@DisplayName("Record 833: City is Northridge")
	void CityOfRecord833() {
		assertEquals("Northridge", customers.get(832).getCity());
	}

	@Test
	@DisplayName("Record 833: County is Los Angeles")
	void CountyOfRecord833() {
		assertEquals("Los Angeles", customers.get(832).getCounty());
	}

	@Test
	@DisplayName("Record 833: State is CA")
	void StateOfRecord833() {
		assertEquals("CA", customers.get(832).getState());
	}

	@Test
	@DisplayName("Record 833: ZIP is 91324")
	void ZIPOfRecord833() {
		assertEquals("91324", customers.get(832).getZIP());
	}

	@Test
	@DisplayName("Record 833: Phone is 818-349-5229")
	void PhoneOfRecord833() {
		assertEquals("818-349-5229", customers.get(832).getPhone());
	}

	@Test
	@DisplayName("Record 833: Fax is 818-349-5449")
	void FaxOfRecord833() {
		assertEquals("818-349-5449", customers.get(832).getFax());
	}

	@Test
	@DisplayName("Record 833: Email is brian@kramarczyk.com")
	void EmailOfRecord833() {
		assertEquals("brian@kramarczyk.com", customers.get(832).getEmail());
	}

	@Test
	@DisplayName("Record 833: Web is http://www.briankramarczyk.com")
	void WebOfRecord833() {
		assertEquals("http://www.briankramarczyk.com", customers.get(832).getWeb());
	}
}
