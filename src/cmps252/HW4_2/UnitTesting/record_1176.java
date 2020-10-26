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

@Tag("20")
class Record_1176 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1176: FirstName is Anthony")
	void FirstNameOfRecord1176() {
		assertEquals("Anthony", customers.get(1175).getFirstName());
	}

	@Test
	@DisplayName("Record 1176: LastName is Hymburger")
	void LastNameOfRecord1176() {
		assertEquals("Hymburger", customers.get(1175).getLastName());
	}

	@Test
	@DisplayName("Record 1176: Company is Diamond Lumber")
	void CompanyOfRecord1176() {
		assertEquals("Diamond Lumber", customers.get(1175).getCompany());
	}

	@Test
	@DisplayName("Record 1176: Address is 1710 N Tate School Rd")
	void AddressOfRecord1176() {
		assertEquals("1710 N Tate School Rd", customers.get(1175).getAddress());
	}

	@Test
	@DisplayName("Record 1176: City is Cantonment")
	void CityOfRecord1176() {
		assertEquals("Cantonment", customers.get(1175).getCity());
	}

	@Test
	@DisplayName("Record 1176: County is Escambia")
	void CountyOfRecord1176() {
		assertEquals("Escambia", customers.get(1175).getCounty());
	}

	@Test
	@DisplayName("Record 1176: State is FL")
	void StateOfRecord1176() {
		assertEquals("FL", customers.get(1175).getState());
	}

	@Test
	@DisplayName("Record 1176: ZIP is 32533")
	void ZIPOfRecord1176() {
		assertEquals("32533", customers.get(1175).getZIP());
	}

	@Test
	@DisplayName("Record 1176: Phone is 850-968-9351")
	void PhoneOfRecord1176() {
		assertEquals("850-968-9351", customers.get(1175).getPhone());
	}

	@Test
	@DisplayName("Record 1176: Fax is 850-968-8561")
	void FaxOfRecord1176() {
		assertEquals("850-968-8561", customers.get(1175).getFax());
	}

	@Test
	@DisplayName("Record 1176: Email is anthony@hymburger.com")
	void EmailOfRecord1176() {
		assertEquals("anthony@hymburger.com", customers.get(1175).getEmail());
	}

	@Test
	@DisplayName("Record 1176: Web is http://www.anthonyhymburger.com")
	void WebOfRecord1176() {
		assertEquals("http://www.anthonyhymburger.com", customers.get(1175).getWeb());
	}
}
