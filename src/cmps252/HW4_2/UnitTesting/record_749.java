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

@Tag("12")
class Record_749 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 749: FirstName is Maryanne")
	void FirstNameOfRecord749() {
		assertEquals("Maryanne", customers.get(748).getFirstName());
	}

	@Test
	@DisplayName("Record 749: LastName is Peveto")
	void LastNameOfRecord749() {
		assertEquals("Peveto", customers.get(748).getLastName());
	}

	@Test
	@DisplayName("Record 749: Company is Santini Iron Wks Padillas Weld")
	void CompanyOfRecord749() {
		assertEquals("Santini Iron Wks Padillas Weld", customers.get(748).getCompany());
	}

	@Test
	@DisplayName("Record 749: Address is 14120 Holly Ave")
	void AddressOfRecord749() {
		assertEquals("14120 Holly Ave", customers.get(748).getAddress());
	}

	@Test
	@DisplayName("Record 749: City is Flushing")
	void CityOfRecord749() {
		assertEquals("Flushing", customers.get(748).getCity());
	}

	@Test
	@DisplayName("Record 749: County is Queens")
	void CountyOfRecord749() {
		assertEquals("Queens", customers.get(748).getCounty());
	}

	@Test
	@DisplayName("Record 749: State is NY")
	void StateOfRecord749() {
		assertEquals("NY", customers.get(748).getState());
	}

	@Test
	@DisplayName("Record 749: ZIP is 11355")
	void ZIPOfRecord749() {
		assertEquals("11355", customers.get(748).getZIP());
	}

	@Test
	@DisplayName("Record 749: Phone is 718-358-9829")
	void PhoneOfRecord749() {
		assertEquals("718-358-9829", customers.get(748).getPhone());
	}

	@Test
	@DisplayName("Record 749: Fax is 718-358-9585")
	void FaxOfRecord749() {
		assertEquals("718-358-9585", customers.get(748).getFax());
	}

	@Test
	@DisplayName("Record 749: Email is maryanne@peveto.com")
	void EmailOfRecord749() {
		assertEquals("maryanne@peveto.com", customers.get(748).getEmail());
	}

	@Test
	@DisplayName("Record 749: Web is http://www.maryannepeveto.com")
	void WebOfRecord749() {
		assertEquals("http://www.maryannepeveto.com", customers.get(748).getWeb());
	}
}
