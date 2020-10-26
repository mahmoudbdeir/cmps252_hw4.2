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
class Record_3360 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3360: FirstName is Lazaro")
	void FirstNameOfRecord3360() {
		assertEquals("Lazaro", customers.get(3359).getFirstName());
	}

	@Test
	@DisplayName("Record 3360: LastName is Daughenbaugh")
	void LastNameOfRecord3360() {
		assertEquals("Daughenbaugh", customers.get(3359).getLastName());
	}

	@Test
	@DisplayName("Record 3360: Company is Michele L Flowers")
	void CompanyOfRecord3360() {
		assertEquals("Michele L Flowers", customers.get(3359).getCompany());
	}

	@Test
	@DisplayName("Record 3360: Address is 2820 Se 29th St")
	void AddressOfRecord3360() {
		assertEquals("2820 Se 29th St", customers.get(3359).getAddress());
	}

	@Test
	@DisplayName("Record 3360: City is Topeka")
	void CityOfRecord3360() {
		assertEquals("Topeka", customers.get(3359).getCity());
	}

	@Test
	@DisplayName("Record 3360: County is Shawnee")
	void CountyOfRecord3360() {
		assertEquals("Shawnee", customers.get(3359).getCounty());
	}

	@Test
	@DisplayName("Record 3360: State is KS")
	void StateOfRecord3360() {
		assertEquals("KS", customers.get(3359).getState());
	}

	@Test
	@DisplayName("Record 3360: ZIP is 66605")
	void ZIPOfRecord3360() {
		assertEquals("66605", customers.get(3359).getZIP());
	}

	@Test
	@DisplayName("Record 3360: Phone is 785-266-6505")
	void PhoneOfRecord3360() {
		assertEquals("785-266-6505", customers.get(3359).getPhone());
	}

	@Test
	@DisplayName("Record 3360: Fax is 785-266-9366")
	void FaxOfRecord3360() {
		assertEquals("785-266-9366", customers.get(3359).getFax());
	}

	@Test
	@DisplayName("Record 3360: Email is lazaro@daughenbaugh.com")
	void EmailOfRecord3360() {
		assertEquals("lazaro@daughenbaugh.com", customers.get(3359).getEmail());
	}

	@Test
	@DisplayName("Record 3360: Web is http://www.lazarodaughenbaugh.com")
	void WebOfRecord3360() {
		assertEquals("http://www.lazarodaughenbaugh.com", customers.get(3359).getWeb());
	}
}
