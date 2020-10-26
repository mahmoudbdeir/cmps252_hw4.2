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
class Record_3248 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3248: FirstName is Shana")
	void FirstNameOfRecord3248() {
		assertEquals("Shana", customers.get(3247).getFirstName());
	}

	@Test
	@DisplayName("Record 3248: LastName is Muhlstone")
	void LastNameOfRecord3248() {
		assertEquals("Muhlstone", customers.get(3247).getLastName());
	}

	@Test
	@DisplayName("Record 3248: Company is Radisson Hotel North Dallas")
	void CompanyOfRecord3248() {
		assertEquals("Radisson Hotel North Dallas", customers.get(3247).getCompany());
	}

	@Test
	@DisplayName("Record 3248: Address is 717 S Hacienda Dr")
	void AddressOfRecord3248() {
		assertEquals("717 S Hacienda Dr", customers.get(3247).getAddress());
	}

	@Test
	@DisplayName("Record 3248: City is Tempe")
	void CityOfRecord3248() {
		assertEquals("Tempe", customers.get(3247).getCity());
	}

	@Test
	@DisplayName("Record 3248: County is Maricopa")
	void CountyOfRecord3248() {
		assertEquals("Maricopa", customers.get(3247).getCounty());
	}

	@Test
	@DisplayName("Record 3248: State is AZ")
	void StateOfRecord3248() {
		assertEquals("AZ", customers.get(3247).getState());
	}

	@Test
	@DisplayName("Record 3248: ZIP is 85281")
	void ZIPOfRecord3248() {
		assertEquals("85281", customers.get(3247).getZIP());
	}

	@Test
	@DisplayName("Record 3248: Phone is 480-804-5743")
	void PhoneOfRecord3248() {
		assertEquals("480-804-5743", customers.get(3247).getPhone());
	}

	@Test
	@DisplayName("Record 3248: Fax is 480-804-4847")
	void FaxOfRecord3248() {
		assertEquals("480-804-4847", customers.get(3247).getFax());
	}

	@Test
	@DisplayName("Record 3248: Email is shana@muhlstone.com")
	void EmailOfRecord3248() {
		assertEquals("shana@muhlstone.com", customers.get(3247).getEmail());
	}

	@Test
	@DisplayName("Record 3248: Web is http://www.shanamuhlstone.com")
	void WebOfRecord3248() {
		assertEquals("http://www.shanamuhlstone.com", customers.get(3247).getWeb());
	}
}
