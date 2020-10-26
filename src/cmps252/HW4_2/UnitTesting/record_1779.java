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

@Tag("11")
class Record_1779 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1779: FirstName is Lyman")
	void FirstNameOfRecord1779() {
		assertEquals("Lyman", customers.get(1778).getFirstName());
	}

	@Test
	@DisplayName("Record 1779: LastName is Harlee")
	void LastNameOfRecord1779() {
		assertEquals("Harlee", customers.get(1778).getLastName());
	}

	@Test
	@DisplayName("Record 1779: Company is University Of South Florida")
	void CompanyOfRecord1779() {
		assertEquals("University Of South Florida", customers.get(1778).getCompany());
	}

	@Test
	@DisplayName("Record 1779: Address is 833 Bragg Blvd")
	void AddressOfRecord1779() {
		assertEquals("833 Bragg Blvd", customers.get(1778).getAddress());
	}

	@Test
	@DisplayName("Record 1779: City is Fayetteville")
	void CityOfRecord1779() {
		assertEquals("Fayetteville", customers.get(1778).getCity());
	}

	@Test
	@DisplayName("Record 1779: County is Cumberland")
	void CountyOfRecord1779() {
		assertEquals("Cumberland", customers.get(1778).getCounty());
	}

	@Test
	@DisplayName("Record 1779: State is NC")
	void StateOfRecord1779() {
		assertEquals("NC", customers.get(1778).getState());
	}

	@Test
	@DisplayName("Record 1779: ZIP is 28301")
	void ZIPOfRecord1779() {
		assertEquals("28301", customers.get(1778).getZIP());
	}

	@Test
	@DisplayName("Record 1779: Phone is 910-483-8447")
	void PhoneOfRecord1779() {
		assertEquals("910-483-8447", customers.get(1778).getPhone());
	}

	@Test
	@DisplayName("Record 1779: Fax is 910-483-1114")
	void FaxOfRecord1779() {
		assertEquals("910-483-1114", customers.get(1778).getFax());
	}

	@Test
	@DisplayName("Record 1779: Email is lyman@harlee.com")
	void EmailOfRecord1779() {
		assertEquals("lyman@harlee.com", customers.get(1778).getEmail());
	}

	@Test
	@DisplayName("Record 1779: Web is http://www.lymanharlee.com")
	void WebOfRecord1779() {
		assertEquals("http://www.lymanharlee.com", customers.get(1778).getWeb());
	}
}
