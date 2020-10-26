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

@Tag("41")
class Record_1593 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1593: FirstName is Catrina")
	void FirstNameOfRecord1593() {
		assertEquals("Catrina", customers.get(1592).getFirstName());
	}

	@Test
	@DisplayName("Record 1593: LastName is Mcgiboney")
	void LastNameOfRecord1593() {
		assertEquals("Mcgiboney", customers.get(1592).getLastName());
	}

	@Test
	@DisplayName("Record 1593: Company is John V Pinto & Associates Inc")
	void CompanyOfRecord1593() {
		assertEquals("John V Pinto & Associates Inc", customers.get(1592).getCompany());
	}

	@Test
	@DisplayName("Record 1593: Address is 11337 Wilmson Rd")
	void AddressOfRecord1593() {
		assertEquals("11337 Wilmson Rd", customers.get(1592).getAddress());
	}

	@Test
	@DisplayName("Record 1593: City is Cincinnati")
	void CityOfRecord1593() {
		assertEquals("Cincinnati", customers.get(1592).getCity());
	}

	@Test
	@DisplayName("Record 1593: County is Hamilton")
	void CountyOfRecord1593() {
		assertEquals("Hamilton", customers.get(1592).getCounty());
	}

	@Test
	@DisplayName("Record 1593: State is OH")
	void StateOfRecord1593() {
		assertEquals("OH", customers.get(1592).getState());
	}

	@Test
	@DisplayName("Record 1593: ZIP is 45241")
	void ZIPOfRecord1593() {
		assertEquals("45241", customers.get(1592).getZIP());
	}

	@Test
	@DisplayName("Record 1593: Phone is 513-489-8660")
	void PhoneOfRecord1593() {
		assertEquals("513-489-8660", customers.get(1592).getPhone());
	}

	@Test
	@DisplayName("Record 1593: Fax is 513-489-1955")
	void FaxOfRecord1593() {
		assertEquals("513-489-1955", customers.get(1592).getFax());
	}

	@Test
	@DisplayName("Record 1593: Email is catrina@mcgiboney.com")
	void EmailOfRecord1593() {
		assertEquals("catrina@mcgiboney.com", customers.get(1592).getEmail());
	}

	@Test
	@DisplayName("Record 1593: Web is http://www.catrinamcgiboney.com")
	void WebOfRecord1593() {
		assertEquals("http://www.catrinamcgiboney.com", customers.get(1592).getWeb());
	}
}
