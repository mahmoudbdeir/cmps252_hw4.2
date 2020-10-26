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

@Tag("26")
class Record_3077 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3077: FirstName is Tyron")
	void FirstNameOfRecord3077() {
		assertEquals("Tyron", customers.get(3076).getFirstName());
	}

	@Test
	@DisplayName("Record 3077: LastName is Glavin")
	void LastNameOfRecord3077() {
		assertEquals("Glavin", customers.get(3076).getLastName());
	}

	@Test
	@DisplayName("Record 3077: Company is Marden Harrison & Kreuter Cpa")
	void CompanyOfRecord3077() {
		assertEquals("Marden Harrison & Kreuter Cpa", customers.get(3076).getCompany());
	}

	@Test
	@DisplayName("Record 3077: Address is 151 Mcarthur Ln")
	void AddressOfRecord3077() {
		assertEquals("151 Mcarthur Ln", customers.get(3076).getAddress());
	}

	@Test
	@DisplayName("Record 3077: City is Burlington")
	void CityOfRecord3077() {
		assertEquals("Burlington", customers.get(3076).getCity());
	}

	@Test
	@DisplayName("Record 3077: County is Alamance")
	void CountyOfRecord3077() {
		assertEquals("Alamance", customers.get(3076).getCounty());
	}

	@Test
	@DisplayName("Record 3077: State is NC")
	void StateOfRecord3077() {
		assertEquals("NC", customers.get(3076).getState());
	}

	@Test
	@DisplayName("Record 3077: ZIP is 27217")
	void ZIPOfRecord3077() {
		assertEquals("27217", customers.get(3076).getZIP());
	}

	@Test
	@DisplayName("Record 3077: Phone is 336-584-8575")
	void PhoneOfRecord3077() {
		assertEquals("336-584-8575", customers.get(3076).getPhone());
	}

	@Test
	@DisplayName("Record 3077: Fax is 336-584-1121")
	void FaxOfRecord3077() {
		assertEquals("336-584-1121", customers.get(3076).getFax());
	}

	@Test
	@DisplayName("Record 3077: Email is tyron@glavin.com")
	void EmailOfRecord3077() {
		assertEquals("tyron@glavin.com", customers.get(3076).getEmail());
	}

	@Test
	@DisplayName("Record 3077: Web is http://www.tyronglavin.com")
	void WebOfRecord3077() {
		assertEquals("http://www.tyronglavin.com", customers.get(3076).getWeb());
	}
}
