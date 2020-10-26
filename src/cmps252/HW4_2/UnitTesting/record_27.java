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

@Tag("31")
class Record_27 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 27: FirstName is Hilda")
	void FirstNameOfRecord27() {
		assertEquals("Hilda", customers.get(26).getFirstName());
	}

	@Test
	@DisplayName("Record 27: LastName is Burner")
	void LastNameOfRecord27() {
		assertEquals("Burner", customers.get(26).getLastName());
	}

	@Test
	@DisplayName("Record 27: Company is Home Federal Savings Bank")
	void CompanyOfRecord27() {
		assertEquals("Home Federal Savings Bank", customers.get(26).getCompany());
	}

	@Test
	@DisplayName("Record 27: Address is 2405 Ne Highway 20")
	void AddressOfRecord27() {
		assertEquals("2405 Ne Highway 20", customers.get(26).getAddress());
	}

	@Test
	@DisplayName("Record 27: City is Bend")
	void CityOfRecord27() {
		assertEquals("Bend", customers.get(26).getCity());
	}

	@Test
	@DisplayName("Record 27: County is Deschutes")
	void CountyOfRecord27() {
		assertEquals("Deschutes", customers.get(26).getCounty());
	}

	@Test
	@DisplayName("Record 27: State is OR")
	void StateOfRecord27() {
		assertEquals("OR", customers.get(26).getState());
	}

	@Test
	@DisplayName("Record 27: ZIP is 97701")
	void ZIPOfRecord27() {
		assertEquals("97701", customers.get(26).getZIP());
	}

	@Test
	@DisplayName("Record 27: Phone is 541-389-4758")
	void PhoneOfRecord27() {
		assertEquals("541-389-4758", customers.get(26).getPhone());
	}

	@Test
	@DisplayName("Record 27: Fax is 541-389-5986")
	void FaxOfRecord27() {
		assertEquals("541-389-5986", customers.get(26).getFax());
	}

	@Test
	@DisplayName("Record 27: Email is hilda@burner.com")
	void EmailOfRecord27() {
		assertEquals("hilda@burner.com", customers.get(26).getEmail());
	}

	@Test
	@DisplayName("Record 27: Web is http://www.hildaburner.com")
	void WebOfRecord27() {
		assertEquals("http://www.hildaburner.com", customers.get(26).getWeb());
	}
}
