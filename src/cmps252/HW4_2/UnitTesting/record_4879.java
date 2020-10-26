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

@Tag("29")
class Record_4879 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4879: FirstName is Roosevelt")
	void FirstNameOfRecord4879() {
		assertEquals("Roosevelt", customers.get(4878).getFirstName());
	}

	@Test
	@DisplayName("Record 4879: LastName is Spilis")
	void LastNameOfRecord4879() {
		assertEquals("Spilis", customers.get(4878).getLastName());
	}

	@Test
	@DisplayName("Record 4879: Company is Iowa State Assoc Of Counties")
	void CompanyOfRecord4879() {
		assertEquals("Iowa State Assoc Of Counties", customers.get(4878).getCompany());
	}

	@Test
	@DisplayName("Record 4879: Address is 1087 Shady Run Rd")
	void AddressOfRecord4879() {
		assertEquals("1087 Shady Run Rd", customers.get(4878).getAddress());
	}

	@Test
	@DisplayName("Record 4879: City is Youngstown")
	void CityOfRecord4879() {
		assertEquals("Youngstown", customers.get(4878).getCity());
	}

	@Test
	@DisplayName("Record 4879: County is Mahoning")
	void CountyOfRecord4879() {
		assertEquals("Mahoning", customers.get(4878).getCounty());
	}

	@Test
	@DisplayName("Record 4879: State is OH")
	void StateOfRecord4879() {
		assertEquals("OH", customers.get(4878).getState());
	}

	@Test
	@DisplayName("Record 4879: ZIP is 44502")
	void ZIPOfRecord4879() {
		assertEquals("44502", customers.get(4878).getZIP());
	}

	@Test
	@DisplayName("Record 4879: Phone is 330-783-6020")
	void PhoneOfRecord4879() {
		assertEquals("330-783-6020", customers.get(4878).getPhone());
	}

	@Test
	@DisplayName("Record 4879: Fax is 330-783-1563")
	void FaxOfRecord4879() {
		assertEquals("330-783-1563", customers.get(4878).getFax());
	}

	@Test
	@DisplayName("Record 4879: Email is roosevelt@spilis.com")
	void EmailOfRecord4879() {
		assertEquals("roosevelt@spilis.com", customers.get(4878).getEmail());
	}

	@Test
	@DisplayName("Record 4879: Web is http://www.rooseveltspilis.com")
	void WebOfRecord4879() {
		assertEquals("http://www.rooseveltspilis.com", customers.get(4878).getWeb());
	}
}
