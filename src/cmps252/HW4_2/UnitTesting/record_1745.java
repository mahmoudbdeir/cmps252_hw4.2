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

@Tag("25")
class Record_1745 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1745: FirstName is Delmer")
	void FirstNameOfRecord1745() {
		assertEquals("Delmer", customers.get(1744).getFirstName());
	}

	@Test
	@DisplayName("Record 1745: LastName is Oroak")
	void LastNameOfRecord1745() {
		assertEquals("Oroak", customers.get(1744).getLastName());
	}

	@Test
	@DisplayName("Record 1745: Company is National City Bank")
	void CompanyOfRecord1745() {
		assertEquals("National City Bank", customers.get(1744).getCompany());
	}

	@Test
	@DisplayName("Record 1745: Address is 1 Market St")
	void AddressOfRecord1745() {
		assertEquals("1 Market St", customers.get(1744).getAddress());
	}

	@Test
	@DisplayName("Record 1745: City is Passaic")
	void CityOfRecord1745() {
		assertEquals("Passaic", customers.get(1744).getCity());
	}

	@Test
	@DisplayName("Record 1745: County is Passaic")
	void CountyOfRecord1745() {
		assertEquals("Passaic", customers.get(1744).getCounty());
	}

	@Test
	@DisplayName("Record 1745: State is NJ")
	void StateOfRecord1745() {
		assertEquals("NJ", customers.get(1744).getState());
	}

	@Test
	@DisplayName("Record 1745: ZIP is 7055")
	void ZIPOfRecord1745() {
		assertEquals("07055", customers.get(1744).getZIP());
	}

	@Test
	@DisplayName("Record 1745: Phone is 973-458-6524")
	void PhoneOfRecord1745() {
		assertEquals("973-458-6524", customers.get(1744).getPhone());
	}

	@Test
	@DisplayName("Record 1745: Fax is 973-458-0767")
	void FaxOfRecord1745() {
		assertEquals("973-458-0767", customers.get(1744).getFax());
	}

	@Test
	@DisplayName("Record 1745: Email is delmer@oroak.com")
	void EmailOfRecord1745() {
		assertEquals("delmer@oroak.com", customers.get(1744).getEmail());
	}

	@Test
	@DisplayName("Record 1745: Web is http://www.delmeroroak.com")
	void WebOfRecord1745() {
		assertEquals("http://www.delmeroroak.com", customers.get(1744).getWeb());
	}
}
