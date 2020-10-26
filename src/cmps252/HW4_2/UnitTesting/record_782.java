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

@Tag("32")
class Record_782 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 782: FirstName is Lavern")
	void FirstNameOfRecord782() {
		assertEquals("Lavern", customers.get(781).getFirstName());
	}

	@Test
	@DisplayName("Record 782: LastName is Histand")
	void LastNameOfRecord782() {
		assertEquals("Histand", customers.get(781).getLastName());
	}

	@Test
	@DisplayName("Record 782: Company is Multi Pak Pkgng & Supl Co Inc")
	void CompanyOfRecord782() {
		assertEquals("Multi Pak Pkgng & Supl Co Inc", customers.get(781).getCompany());
	}

	@Test
	@DisplayName("Record 782: Address is 1729 Morris Ave")
	void AddressOfRecord782() {
		assertEquals("1729 Morris Ave", customers.get(781).getAddress());
	}

	@Test
	@DisplayName("Record 782: City is Union")
	void CityOfRecord782() {
		assertEquals("Union", customers.get(781).getCity());
	}

	@Test
	@DisplayName("Record 782: County is Union")
	void CountyOfRecord782() {
		assertEquals("Union", customers.get(781).getCounty());
	}

	@Test
	@DisplayName("Record 782: State is NJ")
	void StateOfRecord782() {
		assertEquals("NJ", customers.get(781).getState());
	}

	@Test
	@DisplayName("Record 782: ZIP is 7083")
	void ZIPOfRecord782() {
		assertEquals("7083", customers.get(781).getZIP());
	}

	@Test
	@DisplayName("Record 782: Phone is 908-686-4818")
	void PhoneOfRecord782() {
		assertEquals("908-686-4818", customers.get(781).getPhone());
	}

	@Test
	@DisplayName("Record 782: Fax is 908-686-7115")
	void FaxOfRecord782() {
		assertEquals("908-686-7115", customers.get(781).getFax());
	}

	@Test
	@DisplayName("Record 782: Email is lavern@histand.com")
	void EmailOfRecord782() {
		assertEquals("lavern@histand.com", customers.get(781).getEmail());
	}

	@Test
	@DisplayName("Record 782: Web is http://www.lavernhistand.com")
	void WebOfRecord782() {
		assertEquals("http://www.lavernhistand.com", customers.get(781).getWeb());
	}
}
