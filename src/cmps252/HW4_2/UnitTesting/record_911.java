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

@Tag("47")
class Record_911 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 911: FirstName is Wiley")
	void FirstNameOfRecord911() {
		assertEquals("Wiley", customers.get(910).getFirstName());
	}

	@Test
	@DisplayName("Record 911: LastName is Hermanstorfer")
	void LastNameOfRecord911() {
		assertEquals("Hermanstorfer", customers.get(910).getLastName());
	}

	@Test
	@DisplayName("Record 911: Company is Epc Identification Systems")
	void CompanyOfRecord911() {
		assertEquals("Epc Identification Systems", customers.get(910).getCompany());
	}

	@Test
	@DisplayName("Record 911: Address is 19201 Orbit Dr")
	void AddressOfRecord911() {
		assertEquals("19201 Orbit Dr", customers.get(910).getAddress());
	}

	@Test
	@DisplayName("Record 911: City is Gaithersburg")
	void CityOfRecord911() {
		assertEquals("Gaithersburg", customers.get(910).getCity());
	}

	@Test
	@DisplayName("Record 911: County is Montgomery")
	void CountyOfRecord911() {
		assertEquals("Montgomery", customers.get(910).getCounty());
	}

	@Test
	@DisplayName("Record 911: State is MD")
	void StateOfRecord911() {
		assertEquals("MD", customers.get(910).getState());
	}

	@Test
	@DisplayName("Record 911: ZIP is 20879")
	void ZIPOfRecord911() {
		assertEquals("20879", customers.get(910).getZIP());
	}

	@Test
	@DisplayName("Record 911: Phone is 301-330-9990")
	void PhoneOfRecord911() {
		assertEquals("301-330-9990", customers.get(910).getPhone());
	}

	@Test
	@DisplayName("Record 911: Fax is 301-330-9405")
	void FaxOfRecord911() {
		assertEquals("301-330-9405", customers.get(910).getFax());
	}

	@Test
	@DisplayName("Record 911: Email is wiley@hermanstorfer.com")
	void EmailOfRecord911() {
		assertEquals("wiley@hermanstorfer.com", customers.get(910).getEmail());
	}

	@Test
	@DisplayName("Record 911: Web is http://www.wileyhermanstorfer.com")
	void WebOfRecord911() {
		assertEquals("http://www.wileyhermanstorfer.com", customers.get(910).getWeb());
	}
}
