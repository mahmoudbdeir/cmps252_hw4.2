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

@Tag("27")
class Record_4919 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4919: FirstName is Filiberto")
	void FirstNameOfRecord4919() {
		assertEquals("Filiberto", customers.get(4918).getFirstName());
	}

	@Test
	@DisplayName("Record 4919: LastName is Marines")
	void LastNameOfRecord4919() {
		assertEquals("Marines", customers.get(4918).getLastName());
	}

	@Test
	@DisplayName("Record 4919: Company is Michael Learman Dds")
	void CompanyOfRecord4919() {
		assertEquals("Michael Learman Dds", customers.get(4918).getCompany());
	}

	@Test
	@DisplayName("Record 4919: Address is 712 E Washington Blvd")
	void AddressOfRecord4919() {
		assertEquals("712 E Washington Blvd", customers.get(4918).getAddress());
	}

	@Test
	@DisplayName("Record 4919: City is Los Angeles")
	void CityOfRecord4919() {
		assertEquals("Los Angeles", customers.get(4918).getCity());
	}

	@Test
	@DisplayName("Record 4919: County is Los Angeles")
	void CountyOfRecord4919() {
		assertEquals("Los Angeles", customers.get(4918).getCounty());
	}

	@Test
	@DisplayName("Record 4919: State is CA")
	void StateOfRecord4919() {
		assertEquals("CA", customers.get(4918).getState());
	}

	@Test
	@DisplayName("Record 4919: ZIP is 90021")
	void ZIPOfRecord4919() {
		assertEquals("90021", customers.get(4918).getZIP());
	}

	@Test
	@DisplayName("Record 4919: Phone is 213-749-2565")
	void PhoneOfRecord4919() {
		assertEquals("213-749-2565", customers.get(4918).getPhone());
	}

	@Test
	@DisplayName("Record 4919: Fax is 213-749-3554")
	void FaxOfRecord4919() {
		assertEquals("213-749-3554", customers.get(4918).getFax());
	}

	@Test
	@DisplayName("Record 4919: Email is filiberto@marines.com")
	void EmailOfRecord4919() {
		assertEquals("filiberto@marines.com", customers.get(4918).getEmail());
	}

	@Test
	@DisplayName("Record 4919: Web is http://www.filibertomarines.com")
	void WebOfRecord4919() {
		assertEquals("http://www.filibertomarines.com", customers.get(4918).getWeb());
	}
}
