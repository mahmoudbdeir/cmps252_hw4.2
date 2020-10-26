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
class Record_4874 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4874: FirstName is Emilie")
	void FirstNameOfRecord4874() {
		assertEquals("Emilie", customers.get(4873).getFirstName());
	}

	@Test
	@DisplayName("Record 4874: LastName is Rux")
	void LastNameOfRecord4874() {
		assertEquals("Rux", customers.get(4873).getLastName());
	}

	@Test
	@DisplayName("Record 4874: Company is Sugden Engineering Co")
	void CompanyOfRecord4874() {
		assertEquals("Sugden Engineering Co", customers.get(4873).getCompany());
	}

	@Test
	@DisplayName("Record 4874: Address is 908 N Garvin St")
	void AddressOfRecord4874() {
		assertEquals("908 N Garvin St", customers.get(4873).getAddress());
	}

	@Test
	@DisplayName("Record 4874: City is Evansville")
	void CityOfRecord4874() {
		assertEquals("Evansville", customers.get(4873).getCity());
	}

	@Test
	@DisplayName("Record 4874: County is Vanderburgh")
	void CountyOfRecord4874() {
		assertEquals("Vanderburgh", customers.get(4873).getCounty());
	}

	@Test
	@DisplayName("Record 4874: State is IN")
	void StateOfRecord4874() {
		assertEquals("IN", customers.get(4873).getState());
	}

	@Test
	@DisplayName("Record 4874: ZIP is 47711")
	void ZIPOfRecord4874() {
		assertEquals("47711", customers.get(4873).getZIP());
	}

	@Test
	@DisplayName("Record 4874: Phone is 812-423-0389")
	void PhoneOfRecord4874() {
		assertEquals("812-423-0389", customers.get(4873).getPhone());
	}

	@Test
	@DisplayName("Record 4874: Fax is 812-423-0113")
	void FaxOfRecord4874() {
		assertEquals("812-423-0113", customers.get(4873).getFax());
	}

	@Test
	@DisplayName("Record 4874: Email is emilie@rux.com")
	void EmailOfRecord4874() {
		assertEquals("emilie@rux.com", customers.get(4873).getEmail());
	}

	@Test
	@DisplayName("Record 4874: Web is http://www.emilierux.com")
	void WebOfRecord4874() {
		assertEquals("http://www.emilierux.com", customers.get(4873).getWeb());
	}
}
