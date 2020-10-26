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

@Tag("14")
class Record_1639 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1639: FirstName is Camille")
	void FirstNameOfRecord1639() {
		assertEquals("Camille", customers.get(1638).getFirstName());
	}

	@Test
	@DisplayName("Record 1639: LastName is Christina")
	void LastNameOfRecord1639() {
		assertEquals("Christina", customers.get(1638).getLastName());
	}

	@Test
	@DisplayName("Record 1639: Company is Bldg & Constrctn Trades Aflcio")
	void CompanyOfRecord1639() {
		assertEquals("Bldg & Constrctn Trades Aflcio", customers.get(1638).getCompany());
	}

	@Test
	@DisplayName("Record 1639: Address is 44 Secor Ln")
	void AddressOfRecord1639() {
		assertEquals("44 Secor Ln", customers.get(1638).getAddress());
	}

	@Test
	@DisplayName("Record 1639: City is Pelham")
	void CityOfRecord1639() {
		assertEquals("Pelham", customers.get(1638).getCity());
	}

	@Test
	@DisplayName("Record 1639: County is Westchester")
	void CountyOfRecord1639() {
		assertEquals("Westchester", customers.get(1638).getCounty());
	}

	@Test
	@DisplayName("Record 1639: State is NY")
	void StateOfRecord1639() {
		assertEquals("NY", customers.get(1638).getState());
	}

	@Test
	@DisplayName("Record 1639: ZIP is 10803")
	void ZIPOfRecord1639() {
		assertEquals("10803", customers.get(1638).getZIP());
	}

	@Test
	@DisplayName("Record 1639: Phone is 914-738-2173")
	void PhoneOfRecord1639() {
		assertEquals("914-738-2173", customers.get(1638).getPhone());
	}

	@Test
	@DisplayName("Record 1639: Fax is 914-738-4346")
	void FaxOfRecord1639() {
		assertEquals("914-738-4346", customers.get(1638).getFax());
	}

	@Test
	@DisplayName("Record 1639: Email is camille@christina.com")
	void EmailOfRecord1639() {
		assertEquals("camille@christina.com", customers.get(1638).getEmail());
	}

	@Test
	@DisplayName("Record 1639: Web is http://www.camillechristina.com")
	void WebOfRecord1639() {
		assertEquals("http://www.camillechristina.com", customers.get(1638).getWeb());
	}
}
