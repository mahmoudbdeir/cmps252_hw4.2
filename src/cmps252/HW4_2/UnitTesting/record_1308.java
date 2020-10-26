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

@Tag("4")
class Record_1308 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1308: FirstName is Susie")
	void FirstNameOfRecord1308() {
		assertEquals("Susie", customers.get(1307).getFirstName());
	}

	@Test
	@DisplayName("Record 1308: LastName is Merkle")
	void LastNameOfRecord1308() {
		assertEquals("Merkle", customers.get(1307).getLastName());
	}

	@Test
	@DisplayName("Record 1308: Company is Karol, Kathleen K Md")
	void CompanyOfRecord1308() {
		assertEquals("Karol, Kathleen K Md", customers.get(1307).getCompany());
	}

	@Test
	@DisplayName("Record 1308: Address is 775 Dow Rd")
	void AddressOfRecord1308() {
		assertEquals("775 Dow Rd", customers.get(1307).getAddress());
	}

	@Test
	@DisplayName("Record 1308: City is Bridgewater")
	void CityOfRecord1308() {
		assertEquals("Bridgewater", customers.get(1307).getCity());
	}

	@Test
	@DisplayName("Record 1308: County is Somerset")
	void CountyOfRecord1308() {
		assertEquals("Somerset", customers.get(1307).getCounty());
	}

	@Test
	@DisplayName("Record 1308: State is NJ")
	void StateOfRecord1308() {
		assertEquals("NJ", customers.get(1307).getState());
	}

	@Test
	@DisplayName("Record 1308: ZIP is 8807")
	void ZIPOfRecord1308() {
		assertEquals("8807", customers.get(1307).getZIP());
	}

	@Test
	@DisplayName("Record 1308: Phone is 908-722-8165")
	void PhoneOfRecord1308() {
		assertEquals("908-722-8165", customers.get(1307).getPhone());
	}

	@Test
	@DisplayName("Record 1308: Fax is 908-722-2781")
	void FaxOfRecord1308() {
		assertEquals("908-722-2781", customers.get(1307).getFax());
	}

	@Test
	@DisplayName("Record 1308: Email is susie@merkle.com")
	void EmailOfRecord1308() {
		assertEquals("susie@merkle.com", customers.get(1307).getEmail());
	}

	@Test
	@DisplayName("Record 1308: Web is http://www.susiemerkle.com")
	void WebOfRecord1308() {
		assertEquals("http://www.susiemerkle.com", customers.get(1307).getWeb());
	}
}
