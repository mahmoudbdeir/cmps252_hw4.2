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
class Record_1298 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1298: FirstName is Deanna")
	void FirstNameOfRecord1298() {
		assertEquals("Deanna", customers.get(1297).getFirstName());
	}

	@Test
	@DisplayName("Record 1298: LastName is Hockensmith")
	void LastNameOfRecord1298() {
		assertEquals("Hockensmith", customers.get(1297).getLastName());
	}

	@Test
	@DisplayName("Record 1298: Company is Evers Electric Inc")
	void CompanyOfRecord1298() {
		assertEquals("Evers Electric Inc", customers.get(1297).getCompany());
	}

	@Test
	@DisplayName("Record 1298: Address is 850 Port Reading Ave")
	void AddressOfRecord1298() {
		assertEquals("850 Port Reading Ave", customers.get(1297).getAddress());
	}

	@Test
	@DisplayName("Record 1298: City is Port Reading")
	void CityOfRecord1298() {
		assertEquals("Port Reading", customers.get(1297).getCity());
	}

	@Test
	@DisplayName("Record 1298: County is Middlesex")
	void CountyOfRecord1298() {
		assertEquals("Middlesex", customers.get(1297).getCounty());
	}

	@Test
	@DisplayName("Record 1298: State is NJ")
	void StateOfRecord1298() {
		assertEquals("NJ", customers.get(1297).getState());
	}

	@Test
	@DisplayName("Record 1298: ZIP is 7064")
	void ZIPOfRecord1298() {
		assertEquals("7064", customers.get(1297).getZIP());
	}

	@Test
	@DisplayName("Record 1298: Phone is 732-541-0073")
	void PhoneOfRecord1298() {
		assertEquals("732-541-0073", customers.get(1297).getPhone());
	}

	@Test
	@DisplayName("Record 1298: Fax is 732-541-2015")
	void FaxOfRecord1298() {
		assertEquals("732-541-2015", customers.get(1297).getFax());
	}

	@Test
	@DisplayName("Record 1298: Email is deanna@hockensmith.com")
	void EmailOfRecord1298() {
		assertEquals("deanna@hockensmith.com", customers.get(1297).getEmail());
	}

	@Test
	@DisplayName("Record 1298: Web is http://www.deannahockensmith.com")
	void WebOfRecord1298() {
		assertEquals("http://www.deannahockensmith.com", customers.get(1297).getWeb());
	}
}
