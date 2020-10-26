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

@Tag("38")
class Record_496 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 496: FirstName is Lorenzo")
	void FirstNameOfRecord496() {
		assertEquals("Lorenzo", customers.get(495).getFirstName());
	}

	@Test
	@DisplayName("Record 496: LastName is Zierk")
	void LastNameOfRecord496() {
		assertEquals("Zierk", customers.get(495).getLastName());
	}

	@Test
	@DisplayName("Record 496: Company is Intrntl Longshoremans Assn Lcl")
	void CompanyOfRecord496() {
		assertEquals("Intrntl Longshoremans Assn Lcl", customers.get(495).getCompany());
	}

	@Test
	@DisplayName("Record 496: Address is 14445 Mile Rd")
	void AddressOfRecord496() {
		assertEquals("14445 Mile Rd", customers.get(495).getAddress());
	}

	@Test
	@DisplayName("Record 496: City is Sterling Hyghts")
	void CityOfRecord496() {
		assertEquals("Sterling Hyghts", customers.get(495).getCity());
	}

	@Test
	@DisplayName("Record 496: County is Macomb")
	void CountyOfRecord496() {
		assertEquals("Macomb", customers.get(495).getCounty());
	}

	@Test
	@DisplayName("Record 496: State is MI")
	void StateOfRecord496() {
		assertEquals("MI", customers.get(495).getState());
	}

	@Test
	@DisplayName("Record 496: ZIP is 48312")
	void ZIPOfRecord496() {
		assertEquals("48312", customers.get(495).getZIP());
	}

	@Test
	@DisplayName("Record 496: Phone is 586-979-7020")
	void PhoneOfRecord496() {
		assertEquals("586-979-7020", customers.get(495).getPhone());
	}

	@Test
	@DisplayName("Record 496: Fax is 586-979-1134")
	void FaxOfRecord496() {
		assertEquals("586-979-1134", customers.get(495).getFax());
	}

	@Test
	@DisplayName("Record 496: Email is lorenzo@zierk.com")
	void EmailOfRecord496() {
		assertEquals("lorenzo@zierk.com", customers.get(495).getEmail());
	}

	@Test
	@DisplayName("Record 496: Web is http://www.lorenzozierk.com")
	void WebOfRecord496() {
		assertEquals("http://www.lorenzozierk.com", customers.get(495).getWeb());
	}
}
