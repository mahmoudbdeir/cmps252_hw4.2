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

@Tag("45")
class Record_3100 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3100: FirstName is Silvia")
	void FirstNameOfRecord3100() {
		assertEquals("Silvia", customers.get(3099).getFirstName());
	}

	@Test
	@DisplayName("Record 3100: LastName is Morentin")
	void LastNameOfRecord3100() {
		assertEquals("Morentin", customers.get(3099).getLastName());
	}

	@Test
	@DisplayName("Record 3100: Company is Hamby, Debra A Md")
	void CompanyOfRecord3100() {
		assertEquals("Hamby, Debra A Md", customers.get(3099).getCompany());
	}

	@Test
	@DisplayName("Record 3100: Address is 1020 W Hamilton St")
	void AddressOfRecord3100() {
		assertEquals("1020 W Hamilton St", customers.get(3099).getAddress());
	}

	@Test
	@DisplayName("Record 3100: City is Allentown")
	void CityOfRecord3100() {
		assertEquals("Allentown", customers.get(3099).getCity());
	}

	@Test
	@DisplayName("Record 3100: County is Lehigh")
	void CountyOfRecord3100() {
		assertEquals("Lehigh", customers.get(3099).getCounty());
	}

	@Test
	@DisplayName("Record 3100: State is PA")
	void StateOfRecord3100() {
		assertEquals("PA", customers.get(3099).getState());
	}

	@Test
	@DisplayName("Record 3100: ZIP is 18101")
	void ZIPOfRecord3100() {
		assertEquals("18101", customers.get(3099).getZIP());
	}

	@Test
	@DisplayName("Record 3100: Phone is 610-778-8238")
	void PhoneOfRecord3100() {
		assertEquals("610-778-8238", customers.get(3099).getPhone());
	}

	@Test
	@DisplayName("Record 3100: Fax is 610-778-8506")
	void FaxOfRecord3100() {
		assertEquals("610-778-8506", customers.get(3099).getFax());
	}

	@Test
	@DisplayName("Record 3100: Email is silvia@morentin.com")
	void EmailOfRecord3100() {
		assertEquals("silvia@morentin.com", customers.get(3099).getEmail());
	}

	@Test
	@DisplayName("Record 3100: Web is http://www.silviamorentin.com")
	void WebOfRecord3100() {
		assertEquals("http://www.silviamorentin.com", customers.get(3099).getWeb());
	}
}
