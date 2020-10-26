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
class Record_44 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 44: FirstName is Ashley")
	void FirstNameOfRecord44() {
		assertEquals("Ashley", customers.get(43).getFirstName());
	}

	@Test
	@DisplayName("Record 44: LastName is Coneway")
	void LastNameOfRecord44() {
		assertEquals("Coneway", customers.get(43).getLastName());
	}

	@Test
	@DisplayName("Record 44: Company is Pearle Vision Express")
	void CompanyOfRecord44() {
		assertEquals("Pearle Vision Express", customers.get(43).getCompany());
	}

	@Test
	@DisplayName("Record 44: Address is 530 S Henderson Rd  #-a")
	void AddressOfRecord44() {
		assertEquals("530 S Henderson Rd  #-a", customers.get(43).getAddress());
	}

	@Test
	@DisplayName("Record 44: City is King of Prussia")
	void CityOfRecord44() {
		assertEquals("King of Prussia", customers.get(43).getCity());
	}

	@Test
	@DisplayName("Record 44: County is Montgomery")
	void CountyOfRecord44() {
		assertEquals("Montgomery", customers.get(43).getCounty());
	}

	@Test
	@DisplayName("Record 44: State is PA")
	void StateOfRecord44() {
		assertEquals("PA", customers.get(43).getState());
	}

	@Test
	@DisplayName("Record 44: ZIP is 19406")
	void ZIPOfRecord44() {
		assertEquals("19406", customers.get(43).getZIP());
	}

	@Test
	@DisplayName("Record 44: Phone is 610-354-6047")
	void PhoneOfRecord44() {
		assertEquals("610-354-6047", customers.get(43).getPhone());
	}

	@Test
	@DisplayName("Record 44: Fax is 610-354-8356")
	void FaxOfRecord44() {
		assertEquals("610-354-8356", customers.get(43).getFax());
	}

	@Test
	@DisplayName("Record 44: Email is ashley@coneway.com")
	void EmailOfRecord44() {
		assertEquals("ashley@coneway.com", customers.get(43).getEmail());
	}

	@Test
	@DisplayName("Record 44: Web is http://www.ashleyconeway.com")
	void WebOfRecord44() {
		assertEquals("http://www.ashleyconeway.com", customers.get(43).getWeb());
	}
}
