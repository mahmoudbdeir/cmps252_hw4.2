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

@Tag("36")
class Record_4863 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4863: FirstName is Cathy")
	void FirstNameOfRecord4863() {
		assertEquals("Cathy", customers.get(4862).getFirstName());
	}

	@Test
	@DisplayName("Record 4863: LastName is Krzyston")
	void LastNameOfRecord4863() {
		assertEquals("Krzyston", customers.get(4862).getLastName());
	}

	@Test
	@DisplayName("Record 4863: Company is Pinkerton Sec & Invstgtn Svc")
	void CompanyOfRecord4863() {
		assertEquals("Pinkerton Sec & Invstgtn Svc", customers.get(4862).getCompany());
	}

	@Test
	@DisplayName("Record 4863: Address is 112 Old Bridge St")
	void AddressOfRecord4863() {
		assertEquals("112 Old Bridge St", customers.get(4862).getAddress());
	}

	@Test
	@DisplayName("Record 4863: City is Jacksonville")
	void CityOfRecord4863() {
		assertEquals("Jacksonville", customers.get(4862).getCity());
	}

	@Test
	@DisplayName("Record 4863: County is Onslow")
	void CountyOfRecord4863() {
		assertEquals("Onslow", customers.get(4862).getCounty());
	}

	@Test
	@DisplayName("Record 4863: State is NC")
	void StateOfRecord4863() {
		assertEquals("NC", customers.get(4862).getState());
	}

	@Test
	@DisplayName("Record 4863: ZIP is 28540")
	void ZIPOfRecord4863() {
		assertEquals("28540", customers.get(4862).getZIP());
	}

	@Test
	@DisplayName("Record 4863: Phone is 910-455-7014")
	void PhoneOfRecord4863() {
		assertEquals("910-455-7014", customers.get(4862).getPhone());
	}

	@Test
	@DisplayName("Record 4863: Fax is 910-455-5135")
	void FaxOfRecord4863() {
		assertEquals("910-455-5135", customers.get(4862).getFax());
	}

	@Test
	@DisplayName("Record 4863: Email is cathy@krzyston.com")
	void EmailOfRecord4863() {
		assertEquals("cathy@krzyston.com", customers.get(4862).getEmail());
	}

	@Test
	@DisplayName("Record 4863: Web is http://www.cathykrzyston.com")
	void WebOfRecord4863() {
		assertEquals("http://www.cathykrzyston.com", customers.get(4862).getWeb());
	}
}
