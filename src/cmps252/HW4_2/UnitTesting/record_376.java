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

@Tag("12")
class Record_376 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 376: FirstName is Kelli")
	void FirstNameOfRecord376() {
		assertEquals("Kelli", customers.get(375).getFirstName());
	}

	@Test
	@DisplayName("Record 376: LastName is Rusiecki")
	void LastNameOfRecord376() {
		assertEquals("Rusiecki", customers.get(375).getLastName());
	}

	@Test
	@DisplayName("Record 376: Company is Hinkle Cox Eaton Coffield")
	void CompanyOfRecord376() {
		assertEquals("Hinkle Cox Eaton Coffield", customers.get(375).getCompany());
	}

	@Test
	@DisplayName("Record 376: Address is 5615 Willow Ln")
	void AddressOfRecord376() {
		assertEquals("5615 Willow Ln", customers.get(375).getAddress());
	}

	@Test
	@DisplayName("Record 376: City is Lake Oswego")
	void CityOfRecord376() {
		assertEquals("Lake Oswego", customers.get(375).getCity());
	}

	@Test
	@DisplayName("Record 376: County is Clackamas")
	void CountyOfRecord376() {
		assertEquals("Clackamas", customers.get(375).getCounty());
	}

	@Test
	@DisplayName("Record 376: State is OR")
	void StateOfRecord376() {
		assertEquals("OR", customers.get(375).getState());
	}

	@Test
	@DisplayName("Record 376: ZIP is 97035")
	void ZIPOfRecord376() {
		assertEquals("97035", customers.get(375).getZIP());
	}

	@Test
	@DisplayName("Record 376: Phone is 503-635-8465")
	void PhoneOfRecord376() {
		assertEquals("503-635-8465", customers.get(375).getPhone());
	}

	@Test
	@DisplayName("Record 376: Fax is 503-635-3835")
	void FaxOfRecord376() {
		assertEquals("503-635-3835", customers.get(375).getFax());
	}

	@Test
	@DisplayName("Record 376: Email is kelli@rusiecki.com")
	void EmailOfRecord376() {
		assertEquals("kelli@rusiecki.com", customers.get(375).getEmail());
	}

	@Test
	@DisplayName("Record 376: Web is http://www.kellirusiecki.com")
	void WebOfRecord376() {
		assertEquals("http://www.kellirusiecki.com", customers.get(375).getWeb());
	}
}
