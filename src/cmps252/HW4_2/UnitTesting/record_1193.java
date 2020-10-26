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

@Tag("44")
class Record_1193 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1193: FirstName is Newton")
	void FirstNameOfRecord1193() {
		assertEquals("Newton", customers.get(1192).getFirstName());
	}

	@Test
	@DisplayName("Record 1193: LastName is Wolanski")
	void LastNameOfRecord1193() {
		assertEquals("Wolanski", customers.get(1192).getLastName());
	}

	@Test
	@DisplayName("Record 1193: Company is Ventura Driveline Repair")
	void CompanyOfRecord1193() {
		assertEquals("Ventura Driveline Repair", customers.get(1192).getCompany());
	}

	@Test
	@DisplayName("Record 1193: Address is 3302 Skillman Ave")
	void AddressOfRecord1193() {
		assertEquals("3302 Skillman Ave", customers.get(1192).getAddress());
	}

	@Test
	@DisplayName("Record 1193: City is Long Island City")
	void CityOfRecord1193() {
		assertEquals("Long Island City", customers.get(1192).getCity());
	}

	@Test
	@DisplayName("Record 1193: County is Queens")
	void CountyOfRecord1193() {
		assertEquals("Queens", customers.get(1192).getCounty());
	}

	@Test
	@DisplayName("Record 1193: State is NY")
	void StateOfRecord1193() {
		assertEquals("NY", customers.get(1192).getState());
	}

	@Test
	@DisplayName("Record 1193: ZIP is 11101")
	void ZIPOfRecord1193() {
		assertEquals("11101", customers.get(1192).getZIP());
	}

	@Test
	@DisplayName("Record 1193: Phone is 718-706-0255")
	void PhoneOfRecord1193() {
		assertEquals("718-706-0255", customers.get(1192).getPhone());
	}

	@Test
	@DisplayName("Record 1193: Fax is 718-706-3568")
	void FaxOfRecord1193() {
		assertEquals("718-706-3568", customers.get(1192).getFax());
	}

	@Test
	@DisplayName("Record 1193: Email is newton@wolanski.com")
	void EmailOfRecord1193() {
		assertEquals("newton@wolanski.com", customers.get(1192).getEmail());
	}

	@Test
	@DisplayName("Record 1193: Web is http://www.newtonwolanski.com")
	void WebOfRecord1193() {
		assertEquals("http://www.newtonwolanski.com", customers.get(1192).getWeb());
	}
}
