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

@Tag("6")
class Record_3796 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3796: FirstName is Catherine")
	void FirstNameOfRecord3796() {
		assertEquals("Catherine", customers.get(3795).getFirstName());
	}

	@Test
	@DisplayName("Record 3796: LastName is Aldrige")
	void LastNameOfRecord3796() {
		assertEquals("Aldrige", customers.get(3795).getLastName());
	}

	@Test
	@DisplayName("Record 3796: Company is Northwest Ar Regl Plan Comm")
	void CompanyOfRecord3796() {
		assertEquals("Northwest Ar Regl Plan Comm", customers.get(3795).getCompany());
	}

	@Test
	@DisplayName("Record 3796: Address is 410 N Brand Blvd")
	void AddressOfRecord3796() {
		assertEquals("410 N Brand Blvd", customers.get(3795).getAddress());
	}

	@Test
	@DisplayName("Record 3796: City is Glendale")
	void CityOfRecord3796() {
		assertEquals("Glendale", customers.get(3795).getCity());
	}

	@Test
	@DisplayName("Record 3796: County is Los Angeles")
	void CountyOfRecord3796() {
		assertEquals("Los Angeles", customers.get(3795).getCounty());
	}

	@Test
	@DisplayName("Record 3796: State is CA")
	void StateOfRecord3796() {
		assertEquals("CA", customers.get(3795).getState());
	}

	@Test
	@DisplayName("Record 3796: ZIP is 91203")
	void ZIPOfRecord3796() {
		assertEquals("91203", customers.get(3795).getZIP());
	}

	@Test
	@DisplayName("Record 3796: Phone is 818-244-8993")
	void PhoneOfRecord3796() {
		assertEquals("818-244-8993", customers.get(3795).getPhone());
	}

	@Test
	@DisplayName("Record 3796: Fax is 818-244-1033")
	void FaxOfRecord3796() {
		assertEquals("818-244-1033", customers.get(3795).getFax());
	}

	@Test
	@DisplayName("Record 3796: Email is catherine@aldrige.com")
	void EmailOfRecord3796() {
		assertEquals("catherine@aldrige.com", customers.get(3795).getEmail());
	}

	@Test
	@DisplayName("Record 3796: Web is http://www.catherinealdrige.com")
	void WebOfRecord3796() {
		assertEquals("http://www.catherinealdrige.com", customers.get(3795).getWeb());
	}
}
