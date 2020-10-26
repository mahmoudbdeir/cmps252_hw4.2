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

@Tag("26")
class Record_4745 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4745: FirstName is Shelley")
	void FirstNameOfRecord4745() {
		assertEquals("Shelley", customers.get(4744).getFirstName());
	}

	@Test
	@DisplayName("Record 4745: LastName is Cromie")
	void LastNameOfRecord4745() {
		assertEquals("Cromie", customers.get(4744).getLastName());
	}

	@Test
	@DisplayName("Record 4745: Company is Hampton Inn Of Naperville")
	void CompanyOfRecord4745() {
		assertEquals("Hampton Inn Of Naperville", customers.get(4744).getCompany());
	}

	@Test
	@DisplayName("Record 4745: Address is 306 E Helen Rd")
	void AddressOfRecord4745() {
		assertEquals("306 E Helen Rd", customers.get(4744).getAddress());
	}

	@Test
	@DisplayName("Record 4745: City is Palatine")
	void CityOfRecord4745() {
		assertEquals("Palatine", customers.get(4744).getCity());
	}

	@Test
	@DisplayName("Record 4745: County is Cook")
	void CountyOfRecord4745() {
		assertEquals("Cook", customers.get(4744).getCounty());
	}

	@Test
	@DisplayName("Record 4745: State is IL")
	void StateOfRecord4745() {
		assertEquals("IL", customers.get(4744).getState());
	}

	@Test
	@DisplayName("Record 4745: ZIP is 60067")
	void ZIPOfRecord4745() {
		assertEquals("60067", customers.get(4744).getZIP());
	}

	@Test
	@DisplayName("Record 4745: Phone is 847-359-1928")
	void PhoneOfRecord4745() {
		assertEquals("847-359-1928", customers.get(4744).getPhone());
	}

	@Test
	@DisplayName("Record 4745: Fax is 847-359-7768")
	void FaxOfRecord4745() {
		assertEquals("847-359-7768", customers.get(4744).getFax());
	}

	@Test
	@DisplayName("Record 4745: Email is shelley@cromie.com")
	void EmailOfRecord4745() {
		assertEquals("shelley@cromie.com", customers.get(4744).getEmail());
	}

	@Test
	@DisplayName("Record 4745: Web is http://www.shelleycromie.com")
	void WebOfRecord4745() {
		assertEquals("http://www.shelleycromie.com", customers.get(4744).getWeb());
	}
}
