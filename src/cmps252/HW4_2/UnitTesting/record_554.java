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

@Tag("0")
class Record_554 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 554: FirstName is Wilfred")
	void FirstNameOfRecord554() {
		assertEquals("Wilfred", customers.get(553).getFirstName());
	}

	@Test
	@DisplayName("Record 554: LastName is Stockhoff")
	void LastNameOfRecord554() {
		assertEquals("Stockhoff", customers.get(553).getLastName());
	}

	@Test
	@DisplayName("Record 554: Company is Cleaning Equipment Trade Assn")
	void CompanyOfRecord554() {
		assertEquals("Cleaning Equipment Trade Assn", customers.get(553).getCompany());
	}

	@Test
	@DisplayName("Record 554: Address is 2525 E Livingston St")
	void AddressOfRecord554() {
		assertEquals("2525 E Livingston St", customers.get(553).getAddress());
	}

	@Test
	@DisplayName("Record 554: City is Springfield")
	void CityOfRecord554() {
		assertEquals("Springfield", customers.get(553).getCity());
	}

	@Test
	@DisplayName("Record 554: County is Greene")
	void CountyOfRecord554() {
		assertEquals("Greene", customers.get(553).getCounty());
	}

	@Test
	@DisplayName("Record 554: State is MO")
	void StateOfRecord554() {
		assertEquals("MO", customers.get(553).getState());
	}

	@Test
	@DisplayName("Record 554: ZIP is 65803")
	void ZIPOfRecord554() {
		assertEquals("65803", customers.get(553).getZIP());
	}

	@Test
	@DisplayName("Record 554: Phone is 417-831-2434")
	void PhoneOfRecord554() {
		assertEquals("417-831-2434", customers.get(553).getPhone());
	}

	@Test
	@DisplayName("Record 554: Fax is 417-831-3779")
	void FaxOfRecord554() {
		assertEquals("417-831-3779", customers.get(553).getFax());
	}

	@Test
	@DisplayName("Record 554: Email is wilfred@stockhoff.com")
	void EmailOfRecord554() {
		assertEquals("wilfred@stockhoff.com", customers.get(553).getEmail());
	}

	@Test
	@DisplayName("Record 554: Web is http://www.wilfredstockhoff.com")
	void WebOfRecord554() {
		assertEquals("http://www.wilfredstockhoff.com", customers.get(553).getWeb());
	}
}
