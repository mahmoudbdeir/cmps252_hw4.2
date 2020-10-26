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

@Tag("48")
class Record_902 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 902: FirstName is Shirley")
	void FirstNameOfRecord902() {
		assertEquals("Shirley", customers.get(901).getFirstName());
	}

	@Test
	@DisplayName("Record 902: LastName is Nowland")
	void LastNameOfRecord902() {
		assertEquals("Nowland", customers.get(901).getLastName());
	}

	@Test
	@DisplayName("Record 902: Company is Bosworth Co")
	void CompanyOfRecord902() {
		assertEquals("Bosworth Co", customers.get(901).getCompany());
	}

	@Test
	@DisplayName("Record 902: Address is 222 Steel St")
	void AddressOfRecord902() {
		assertEquals("222 Steel St", customers.get(901).getAddress());
	}

	@Test
	@DisplayName("Record 902: City is Youngstown")
	void CityOfRecord902() {
		assertEquals("Youngstown", customers.get(901).getCity());
	}

	@Test
	@DisplayName("Record 902: County is Mahoning")
	void CountyOfRecord902() {
		assertEquals("Mahoning", customers.get(901).getCounty());
	}

	@Test
	@DisplayName("Record 902: State is OH")
	void StateOfRecord902() {
		assertEquals("OH", customers.get(901).getState());
	}

	@Test
	@DisplayName("Record 902: ZIP is 44509")
	void ZIPOfRecord902() {
		assertEquals("44509", customers.get(901).getZIP());
	}

	@Test
	@DisplayName("Record 902: Phone is 330-792-6622")
	void PhoneOfRecord902() {
		assertEquals("330-792-6622", customers.get(901).getPhone());
	}

	@Test
	@DisplayName("Record 902: Fax is 330-792-9483")
	void FaxOfRecord902() {
		assertEquals("330-792-9483", customers.get(901).getFax());
	}

	@Test
	@DisplayName("Record 902: Email is shirley@nowland.com")
	void EmailOfRecord902() {
		assertEquals("shirley@nowland.com", customers.get(901).getEmail());
	}

	@Test
	@DisplayName("Record 902: Web is http://www.shirleynowland.com")
	void WebOfRecord902() {
		assertEquals("http://www.shirleynowland.com", customers.get(901).getWeb());
	}
}
