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

@Tag("30")
class Record_4143 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4143: FirstName is Christian")
	void FirstNameOfRecord4143() {
		assertEquals("Christian", customers.get(4142).getFirstName());
	}

	@Test
	@DisplayName("Record 4143: LastName is Tromblay")
	void LastNameOfRecord4143() {
		assertEquals("Tromblay", customers.get(4142).getLastName());
	}

	@Test
	@DisplayName("Record 4143: Company is J Ad Graphics")
	void CompanyOfRecord4143() {
		assertEquals("J Ad Graphics", customers.get(4142).getCompany());
	}

	@Test
	@DisplayName("Record 4143: Address is 25 E 11th Ave")
	void AddressOfRecord4143() {
		assertEquals("25 E 11th Ave", customers.get(4142).getAddress());
	}

	@Test
	@DisplayName("Record 4143: City is Eugene")
	void CityOfRecord4143() {
		assertEquals("Eugene", customers.get(4142).getCity());
	}

	@Test
	@DisplayName("Record 4143: County is Lane")
	void CountyOfRecord4143() {
		assertEquals("Lane", customers.get(4142).getCounty());
	}

	@Test
	@DisplayName("Record 4143: State is OR")
	void StateOfRecord4143() {
		assertEquals("OR", customers.get(4142).getState());
	}

	@Test
	@DisplayName("Record 4143: ZIP is 97401")
	void ZIPOfRecord4143() {
		assertEquals("97401", customers.get(4142).getZIP());
	}

	@Test
	@DisplayName("Record 4143: Phone is 541-342-1799")
	void PhoneOfRecord4143() {
		assertEquals("541-342-1799", customers.get(4142).getPhone());
	}

	@Test
	@DisplayName("Record 4143: Fax is 541-342-8264")
	void FaxOfRecord4143() {
		assertEquals("541-342-8264", customers.get(4142).getFax());
	}

	@Test
	@DisplayName("Record 4143: Email is christian@tromblay.com")
	void EmailOfRecord4143() {
		assertEquals("christian@tromblay.com", customers.get(4142).getEmail());
	}

	@Test
	@DisplayName("Record 4143: Web is http://www.christiantromblay.com")
	void WebOfRecord4143() {
		assertEquals("http://www.christiantromblay.com", customers.get(4142).getWeb());
	}
}
