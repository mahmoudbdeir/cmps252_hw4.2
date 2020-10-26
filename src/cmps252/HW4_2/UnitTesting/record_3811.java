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

@Tag("39")
class Record_3811 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3811: FirstName is Patrice")
	void FirstNameOfRecord3811() {
		assertEquals("Patrice", customers.get(3810).getFirstName());
	}

	@Test
	@DisplayName("Record 3811: LastName is Tambasco")
	void LastNameOfRecord3811() {
		assertEquals("Tambasco", customers.get(3810).getLastName());
	}

	@Test
	@DisplayName("Record 3811: Company is Saratoga Specialties Inc")
	void CompanyOfRecord3811() {
		assertEquals("Saratoga Specialties Inc", customers.get(3810).getCompany());
	}

	@Test
	@DisplayName("Record 3811: Address is 2675 E Us Highway 80")
	void AddressOfRecord3811() {
		assertEquals("2675 E Us Highway 80", customers.get(3810).getAddress());
	}

	@Test
	@DisplayName("Record 3811: City is Abilene")
	void CityOfRecord3811() {
		assertEquals("Abilene", customers.get(3810).getCity());
	}

	@Test
	@DisplayName("Record 3811: County is Taylor")
	void CountyOfRecord3811() {
		assertEquals("Taylor", customers.get(3810).getCounty());
	}

	@Test
	@DisplayName("Record 3811: State is TX")
	void StateOfRecord3811() {
		assertEquals("TX", customers.get(3810).getState());
	}

	@Test
	@DisplayName("Record 3811: ZIP is 79601")
	void ZIPOfRecord3811() {
		assertEquals("79601", customers.get(3810).getZIP());
	}

	@Test
	@DisplayName("Record 3811: Phone is 325-677-3037")
	void PhoneOfRecord3811() {
		assertEquals("325-677-3037", customers.get(3810).getPhone());
	}

	@Test
	@DisplayName("Record 3811: Fax is 325-677-2506")
	void FaxOfRecord3811() {
		assertEquals("325-677-2506", customers.get(3810).getFax());
	}

	@Test
	@DisplayName("Record 3811: Email is patrice@tambasco.com")
	void EmailOfRecord3811() {
		assertEquals("patrice@tambasco.com", customers.get(3810).getEmail());
	}

	@Test
	@DisplayName("Record 3811: Web is http://www.patricetambasco.com")
	void WebOfRecord3811() {
		assertEquals("http://www.patricetambasco.com", customers.get(3810).getWeb());
	}
}
