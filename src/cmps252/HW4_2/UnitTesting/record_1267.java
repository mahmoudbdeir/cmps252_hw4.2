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

@Tag("13")
class Record_1267 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1267: FirstName is Jeremiah")
	void FirstNameOfRecord1267() {
		assertEquals("Jeremiah", customers.get(1266).getFirstName());
	}

	@Test
	@DisplayName("Record 1267: LastName is Esenwyn")
	void LastNameOfRecord1267() {
		assertEquals("Esenwyn", customers.get(1266).getLastName());
	}

	@Test
	@DisplayName("Record 1267: Company is Lakeview Industries Inc")
	void CompanyOfRecord1267() {
		assertEquals("Lakeview Industries Inc", customers.get(1266).getCompany());
	}

	@Test
	@DisplayName("Record 1267: Address is 475 Northgate Mile")
	void AddressOfRecord1267() {
		assertEquals("475 Northgate Mile", customers.get(1266).getAddress());
	}

	@Test
	@DisplayName("Record 1267: City is Idaho Falls")
	void CityOfRecord1267() {
		assertEquals("Idaho Falls", customers.get(1266).getCity());
	}

	@Test
	@DisplayName("Record 1267: County is Bonneville")
	void CountyOfRecord1267() {
		assertEquals("Bonneville", customers.get(1266).getCounty());
	}

	@Test
	@DisplayName("Record 1267: State is ID")
	void StateOfRecord1267() {
		assertEquals("ID", customers.get(1266).getState());
	}

	@Test
	@DisplayName("Record 1267: ZIP is 83401")
	void ZIPOfRecord1267() {
		assertEquals("83401", customers.get(1266).getZIP());
	}

	@Test
	@DisplayName("Record 1267: Phone is 208-522-7689")
	void PhoneOfRecord1267() {
		assertEquals("208-522-7689", customers.get(1266).getPhone());
	}

	@Test
	@DisplayName("Record 1267: Fax is 208-522-8924")
	void FaxOfRecord1267() {
		assertEquals("208-522-8924", customers.get(1266).getFax());
	}

	@Test
	@DisplayName("Record 1267: Email is jeremiah@esenwyn.com")
	void EmailOfRecord1267() {
		assertEquals("jeremiah@esenwyn.com", customers.get(1266).getEmail());
	}

	@Test
	@DisplayName("Record 1267: Web is http://www.jeremiahesenwyn.com")
	void WebOfRecord1267() {
		assertEquals("http://www.jeremiahesenwyn.com", customers.get(1266).getWeb());
	}
}
