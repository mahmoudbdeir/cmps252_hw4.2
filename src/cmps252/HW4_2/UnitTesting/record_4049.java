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

@Tag("27")
class Record_4049 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4049: FirstName is Pearl")
	void FirstNameOfRecord4049() {
		assertEquals("Pearl", customers.get(4048).getFirstName());
	}

	@Test
	@DisplayName("Record 4049: LastName is Isaacs")
	void LastNameOfRecord4049() {
		assertEquals("Isaacs", customers.get(4048).getLastName());
	}

	@Test
	@DisplayName("Record 4049: Company is Mx International Security Svc")
	void CompanyOfRecord4049() {
		assertEquals("Mx International Security Svc", customers.get(4048).getCompany());
	}

	@Test
	@DisplayName("Record 4049: Address is 1020 Old York Rd")
	void AddressOfRecord4049() {
		assertEquals("1020 Old York Rd", customers.get(4048).getAddress());
	}

	@Test
	@DisplayName("Record 4049: City is Abington")
	void CityOfRecord4049() {
		assertEquals("Abington", customers.get(4048).getCity());
	}

	@Test
	@DisplayName("Record 4049: County is Montgomery")
	void CountyOfRecord4049() {
		assertEquals("Montgomery", customers.get(4048).getCounty());
	}

	@Test
	@DisplayName("Record 4049: State is PA")
	void StateOfRecord4049() {
		assertEquals("PA", customers.get(4048).getState());
	}

	@Test
	@DisplayName("Record 4049: ZIP is 19001")
	void ZIPOfRecord4049() {
		assertEquals("19001", customers.get(4048).getZIP());
	}

	@Test
	@DisplayName("Record 4049: Phone is 215-887-9871")
	void PhoneOfRecord4049() {
		assertEquals("215-887-9871", customers.get(4048).getPhone());
	}

	@Test
	@DisplayName("Record 4049: Fax is 215-887-3548")
	void FaxOfRecord4049() {
		assertEquals("215-887-3548", customers.get(4048).getFax());
	}

	@Test
	@DisplayName("Record 4049: Email is pearl@isaacs.com")
	void EmailOfRecord4049() {
		assertEquals("pearl@isaacs.com", customers.get(4048).getEmail());
	}

	@Test
	@DisplayName("Record 4049: Web is http://www.pearlisaacs.com")
	void WebOfRecord4049() {
		assertEquals("http://www.pearlisaacs.com", customers.get(4048).getWeb());
	}
}
