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
class Record_399 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 399: FirstName is Ellen")
	void FirstNameOfRecord399() {
		assertEquals("Ellen", customers.get(398).getFirstName());
	}

	@Test
	@DisplayName("Record 399: LastName is Biondi")
	void LastNameOfRecord399() {
		assertEquals("Biondi", customers.get(398).getLastName());
	}

	@Test
	@DisplayName("Record 399: Company is Thin Red Line Co")
	void CompanyOfRecord399() {
		assertEquals("Thin Red Line Co", customers.get(398).getCompany());
	}

	@Test
	@DisplayName("Record 399: Address is 120 E Magnolia Blvd")
	void AddressOfRecord399() {
		assertEquals("120 E Magnolia Blvd", customers.get(398).getAddress());
	}

	@Test
	@DisplayName("Record 399: City is Burbank")
	void CityOfRecord399() {
		assertEquals("Burbank", customers.get(398).getCity());
	}

	@Test
	@DisplayName("Record 399: County is Los Angeles")
	void CountyOfRecord399() {
		assertEquals("Los Angeles", customers.get(398).getCounty());
	}

	@Test
	@DisplayName("Record 399: State is CA")
	void StateOfRecord399() {
		assertEquals("CA", customers.get(398).getState());
	}

	@Test
	@DisplayName("Record 399: ZIP is 91502")
	void ZIPOfRecord399() {
		assertEquals("91502", customers.get(398).getZIP());
	}

	@Test
	@DisplayName("Record 399: Phone is 818-954-8462")
	void PhoneOfRecord399() {
		assertEquals("818-954-8462", customers.get(398).getPhone());
	}

	@Test
	@DisplayName("Record 399: Fax is 818-954-9797")
	void FaxOfRecord399() {
		assertEquals("818-954-9797", customers.get(398).getFax());
	}

	@Test
	@DisplayName("Record 399: Email is ellen@biondi.com")
	void EmailOfRecord399() {
		assertEquals("ellen@biondi.com", customers.get(398).getEmail());
	}

	@Test
	@DisplayName("Record 399: Web is http://www.ellenbiondi.com")
	void WebOfRecord399() {
		assertEquals("http://www.ellenbiondi.com", customers.get(398).getWeb());
	}
}
