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

@Tag("3")
class Record_1149 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1149: FirstName is Johnie")
	void FirstNameOfRecord1149() {
		assertEquals("Johnie", customers.get(1148).getFirstName());
	}

	@Test
	@DisplayName("Record 1149: LastName is Boarts")
	void LastNameOfRecord1149() {
		assertEquals("Boarts", customers.get(1148).getLastName());
	}

	@Test
	@DisplayName("Record 1149: Company is Warren Gorham Lamont")
	void CompanyOfRecord1149() {
		assertEquals("Warren Gorham Lamont", customers.get(1148).getCompany());
	}

	@Test
	@DisplayName("Record 1149: Address is 105 Calvert St")
	void AddressOfRecord1149() {
		assertEquals("105 Calvert St", customers.get(1148).getAddress());
	}

	@Test
	@DisplayName("Record 1149: City is Harrison")
	void CityOfRecord1149() {
		assertEquals("Harrison", customers.get(1148).getCity());
	}

	@Test
	@DisplayName("Record 1149: County is Westchester")
	void CountyOfRecord1149() {
		assertEquals("Westchester", customers.get(1148).getCounty());
	}

	@Test
	@DisplayName("Record 1149: State is NY")
	void StateOfRecord1149() {
		assertEquals("NY", customers.get(1148).getState());
	}

	@Test
	@DisplayName("Record 1149: ZIP is 10528")
	void ZIPOfRecord1149() {
		assertEquals("10528", customers.get(1148).getZIP());
	}

	@Test
	@DisplayName("Record 1149: Phone is 914-835-9557")
	void PhoneOfRecord1149() {
		assertEquals("914-835-9557", customers.get(1148).getPhone());
	}

	@Test
	@DisplayName("Record 1149: Fax is 914-835-7652")
	void FaxOfRecord1149() {
		assertEquals("914-835-7652", customers.get(1148).getFax());
	}

	@Test
	@DisplayName("Record 1149: Email is johnie@boarts.com")
	void EmailOfRecord1149() {
		assertEquals("johnie@boarts.com", customers.get(1148).getEmail());
	}

	@Test
	@DisplayName("Record 1149: Web is http://www.johnieboarts.com")
	void WebOfRecord1149() {
		assertEquals("http://www.johnieboarts.com", customers.get(1148).getWeb());
	}
}
