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
class Record_4340 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4340: FirstName is Emilia")
	void FirstNameOfRecord4340() {
		assertEquals("Emilia", customers.get(4339).getFirstName());
	}

	@Test
	@DisplayName("Record 4340: LastName is Buddington")
	void LastNameOfRecord4340() {
		assertEquals("Buddington", customers.get(4339).getLastName());
	}

	@Test
	@DisplayName("Record 4340: Company is J K Kidd & Co")
	void CompanyOfRecord4340() {
		assertEquals("J K Kidd & Co", customers.get(4339).getCompany());
	}

	@Test
	@DisplayName("Record 4340: Address is 625 Marquette Ave  #-715")
	void AddressOfRecord4340() {
		assertEquals("625 Marquette Ave  #-715", customers.get(4339).getAddress());
	}

	@Test
	@DisplayName("Record 4340: City is Minneapolis")
	void CityOfRecord4340() {
		assertEquals("Minneapolis", customers.get(4339).getCity());
	}

	@Test
	@DisplayName("Record 4340: County is Hennepin")
	void CountyOfRecord4340() {
		assertEquals("Hennepin", customers.get(4339).getCounty());
	}

	@Test
	@DisplayName("Record 4340: State is MN")
	void StateOfRecord4340() {
		assertEquals("MN", customers.get(4339).getState());
	}

	@Test
	@DisplayName("Record 4340: ZIP is 55402")
	void ZIPOfRecord4340() {
		assertEquals("55402", customers.get(4339).getZIP());
	}

	@Test
	@DisplayName("Record 4340: Phone is 612-342-5073")
	void PhoneOfRecord4340() {
		assertEquals("612-342-5073", customers.get(4339).getPhone());
	}

	@Test
	@DisplayName("Record 4340: Fax is 612-342-0216")
	void FaxOfRecord4340() {
		assertEquals("612-342-0216", customers.get(4339).getFax());
	}

	@Test
	@DisplayName("Record 4340: Email is emilia@buddington.com")
	void EmailOfRecord4340() {
		assertEquals("emilia@buddington.com", customers.get(4339).getEmail());
	}

	@Test
	@DisplayName("Record 4340: Web is http://www.emiliabuddington.com")
	void WebOfRecord4340() {
		assertEquals("http://www.emiliabuddington.com", customers.get(4339).getWeb());
	}
}
