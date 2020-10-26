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
class Record_259 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 259: FirstName is Cheri")
	void FirstNameOfRecord259() {
		assertEquals("Cheri", customers.get(258).getFirstName());
	}

	@Test
	@DisplayName("Record 259: LastName is Hepfer")
	void LastNameOfRecord259() {
		assertEquals("Hepfer", customers.get(258).getLastName());
	}

	@Test
	@DisplayName("Record 259: Company is Executive Research Corp")
	void CompanyOfRecord259() {
		assertEquals("Executive Research Corp", customers.get(258).getCompany());
	}

	@Test
	@DisplayName("Record 259: Address is 229 N Green St")
	void AddressOfRecord259() {
		assertEquals("229 N Green St", customers.get(258).getAddress());
	}

	@Test
	@DisplayName("Record 259: City is Easton")
	void CityOfRecord259() {
		assertEquals("Easton", customers.get(258).getCity());
	}

	@Test
	@DisplayName("Record 259: County is Northampton")
	void CountyOfRecord259() {
		assertEquals("Northampton", customers.get(258).getCounty());
	}

	@Test
	@DisplayName("Record 259: State is PA")
	void StateOfRecord259() {
		assertEquals("PA", customers.get(258).getState());
	}

	@Test
	@DisplayName("Record 259: ZIP is 18042")
	void ZIPOfRecord259() {
		assertEquals("18042", customers.get(258).getZIP());
	}

	@Test
	@DisplayName("Record 259: Phone is 610-863-5063")
	void PhoneOfRecord259() {
		assertEquals("610-863-5063", customers.get(258).getPhone());
	}

	@Test
	@DisplayName("Record 259: Fax is 610-863-2567")
	void FaxOfRecord259() {
		assertEquals("610-863-2567", customers.get(258).getFax());
	}

	@Test
	@DisplayName("Record 259: Email is cheri@hepfer.com")
	void EmailOfRecord259() {
		assertEquals("cheri@hepfer.com", customers.get(258).getEmail());
	}

	@Test
	@DisplayName("Record 259: Web is http://www.cherihepfer.com")
	void WebOfRecord259() {
		assertEquals("http://www.cherihepfer.com", customers.get(258).getWeb());
	}
}
