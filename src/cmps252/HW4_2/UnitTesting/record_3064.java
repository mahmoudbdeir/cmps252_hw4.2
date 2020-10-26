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

@Tag("28")
class Record_3064 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3064: FirstName is Samual")
	void FirstNameOfRecord3064() {
		assertEquals("Samual", customers.get(3063).getFirstName());
	}

	@Test
	@DisplayName("Record 3064: LastName is Quillin")
	void LastNameOfRecord3064() {
		assertEquals("Quillin", customers.get(3063).getLastName());
	}

	@Test
	@DisplayName("Record 3064: Company is Jetco Inc")
	void CompanyOfRecord3064() {
		assertEquals("Jetco Inc", customers.get(3063).getCompany());
	}

	@Test
	@DisplayName("Record 3064: Address is 340 S Centre St")
	void AddressOfRecord3064() {
		assertEquals("340 S Centre St", customers.get(3063).getAddress());
	}

	@Test
	@DisplayName("Record 3064: City is Pottsville")
	void CityOfRecord3064() {
		assertEquals("Pottsville", customers.get(3063).getCity());
	}

	@Test
	@DisplayName("Record 3064: County is Schuylkill")
	void CountyOfRecord3064() {
		assertEquals("Schuylkill", customers.get(3063).getCounty());
	}

	@Test
	@DisplayName("Record 3064: State is PA")
	void StateOfRecord3064() {
		assertEquals("PA", customers.get(3063).getState());
	}

	@Test
	@DisplayName("Record 3064: ZIP is 17901")
	void ZIPOfRecord3064() {
		assertEquals("17901", customers.get(3063).getZIP());
	}

	@Test
	@DisplayName("Record 3064: Phone is 570-622-5817")
	void PhoneOfRecord3064() {
		assertEquals("570-622-5817", customers.get(3063).getPhone());
	}

	@Test
	@DisplayName("Record 3064: Fax is 570-622-8952")
	void FaxOfRecord3064() {
		assertEquals("570-622-8952", customers.get(3063).getFax());
	}

	@Test
	@DisplayName("Record 3064: Email is samual@quillin.com")
	void EmailOfRecord3064() {
		assertEquals("samual@quillin.com", customers.get(3063).getEmail());
	}

	@Test
	@DisplayName("Record 3064: Web is http://www.samualquillin.com")
	void WebOfRecord3064() {
		assertEquals("http://www.samualquillin.com", customers.get(3063).getWeb());
	}
}
