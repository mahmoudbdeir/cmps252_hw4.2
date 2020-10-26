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

@Tag("23")
class Record_3216 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3216: FirstName is Geneva")
	void FirstNameOfRecord3216() {
		assertEquals("Geneva", customers.get(3215).getFirstName());
	}

	@Test
	@DisplayName("Record 3216: LastName is Matskin")
	void LastNameOfRecord3216() {
		assertEquals("Matskin", customers.get(3215).getLastName());
	}

	@Test
	@DisplayName("Record 3216: Company is Robert H Schaffer & Associates")
	void CompanyOfRecord3216() {
		assertEquals("Robert H Schaffer & Associates", customers.get(3215).getCompany());
	}

	@Test
	@DisplayName("Record 3216: Address is 2361 S Plaza Dr")
	void AddressOfRecord3216() {
		assertEquals("2361 S Plaza Dr", customers.get(3215).getAddress());
	}

	@Test
	@DisplayName("Record 3216: City is Rapid City")
	void CityOfRecord3216() {
		assertEquals("Rapid City", customers.get(3215).getCity());
	}

	@Test
	@DisplayName("Record 3216: County is Pennington")
	void CountyOfRecord3216() {
		assertEquals("Pennington", customers.get(3215).getCounty());
	}

	@Test
	@DisplayName("Record 3216: State is SD")
	void StateOfRecord3216() {
		assertEquals("SD", customers.get(3215).getState());
	}

	@Test
	@DisplayName("Record 3216: ZIP is 57702")
	void ZIPOfRecord3216() {
		assertEquals("57702", customers.get(3215).getZIP());
	}

	@Test
	@DisplayName("Record 3216: Phone is 605-341-9604")
	void PhoneOfRecord3216() {
		assertEquals("605-341-9604", customers.get(3215).getPhone());
	}

	@Test
	@DisplayName("Record 3216: Fax is 605-341-6434")
	void FaxOfRecord3216() {
		assertEquals("605-341-6434", customers.get(3215).getFax());
	}

	@Test
	@DisplayName("Record 3216: Email is geneva@matskin.com")
	void EmailOfRecord3216() {
		assertEquals("geneva@matskin.com", customers.get(3215).getEmail());
	}

	@Test
	@DisplayName("Record 3216: Web is http://www.genevamatskin.com")
	void WebOfRecord3216() {
		assertEquals("http://www.genevamatskin.com", customers.get(3215).getWeb());
	}
}
