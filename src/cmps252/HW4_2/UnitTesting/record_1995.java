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

@Tag("37")
class Record_1995 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1995: FirstName is Abigail")
	void FirstNameOfRecord1995() {
		assertEquals("Abigail", customers.get(1994).getFirstName());
	}

	@Test
	@DisplayName("Record 1995: LastName is Biersner")
	void LastNameOfRecord1995() {
		assertEquals("Biersner", customers.get(1994).getLastName());
	}

	@Test
	@DisplayName("Record 1995: Company is Texcom Inc")
	void CompanyOfRecord1995() {
		assertEquals("Texcom Inc", customers.get(1994).getCompany());
	}

	@Test
	@DisplayName("Record 1995: Address is 2607 Andjon Dr")
	void AddressOfRecord1995() {
		assertEquals("2607 Andjon Dr", customers.get(1994).getAddress());
	}

	@Test
	@DisplayName("Record 1995: City is Dallas")
	void CityOfRecord1995() {
		assertEquals("Dallas", customers.get(1994).getCity());
	}

	@Test
	@DisplayName("Record 1995: County is Dallas")
	void CountyOfRecord1995() {
		assertEquals("Dallas", customers.get(1994).getCounty());
	}

	@Test
	@DisplayName("Record 1995: State is TX")
	void StateOfRecord1995() {
		assertEquals("TX", customers.get(1994).getState());
	}

	@Test
	@DisplayName("Record 1995: ZIP is 75220")
	void ZIPOfRecord1995() {
		assertEquals("75220", customers.get(1994).getZIP());
	}

	@Test
	@DisplayName("Record 1995: Phone is 214-350-5230")
	void PhoneOfRecord1995() {
		assertEquals("214-350-5230", customers.get(1994).getPhone());
	}

	@Test
	@DisplayName("Record 1995: Fax is 214-350-7397")
	void FaxOfRecord1995() {
		assertEquals("214-350-7397", customers.get(1994).getFax());
	}

	@Test
	@DisplayName("Record 1995: Email is abigail@biersner.com")
	void EmailOfRecord1995() {
		assertEquals("abigail@biersner.com", customers.get(1994).getEmail());
	}

	@Test
	@DisplayName("Record 1995: Web is http://www.abigailbiersner.com")
	void WebOfRecord1995() {
		assertEquals("http://www.abigailbiersner.com", customers.get(1994).getWeb());
	}
}
