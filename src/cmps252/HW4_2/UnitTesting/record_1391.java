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

@Tag("8")
class Record_1391 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1391: FirstName is Hester")
	void FirstNameOfRecord1391() {
		assertEquals("Hester", customers.get(1390).getFirstName());
	}

	@Test
	@DisplayName("Record 1391: LastName is Taborda")
	void LastNameOfRecord1391() {
		assertEquals("Taborda", customers.get(1390).getLastName());
	}

	@Test
	@DisplayName("Record 1391: Company is Citizens Bank")
	void CompanyOfRecord1391() {
		assertEquals("Citizens Bank", customers.get(1390).getCompany());
	}

	@Test
	@DisplayName("Record 1391: Address is 1335 Nw Northrup St")
	void AddressOfRecord1391() {
		assertEquals("1335 Nw Northrup St", customers.get(1390).getAddress());
	}

	@Test
	@DisplayName("Record 1391: City is Portland")
	void CityOfRecord1391() {
		assertEquals("Portland", customers.get(1390).getCity());
	}

	@Test
	@DisplayName("Record 1391: County is Multnomah")
	void CountyOfRecord1391() {
		assertEquals("Multnomah", customers.get(1390).getCounty());
	}

	@Test
	@DisplayName("Record 1391: State is OR")
	void StateOfRecord1391() {
		assertEquals("OR", customers.get(1390).getState());
	}

	@Test
	@DisplayName("Record 1391: ZIP is 97209")
	void ZIPOfRecord1391() {
		assertEquals("97209", customers.get(1390).getZIP());
	}

	@Test
	@DisplayName("Record 1391: Phone is 503-224-7420")
	void PhoneOfRecord1391() {
		assertEquals("503-224-7420", customers.get(1390).getPhone());
	}

	@Test
	@DisplayName("Record 1391: Fax is 503-224-9431")
	void FaxOfRecord1391() {
		assertEquals("503-224-9431", customers.get(1390).getFax());
	}

	@Test
	@DisplayName("Record 1391: Email is hester@taborda.com")
	void EmailOfRecord1391() {
		assertEquals("hester@taborda.com", customers.get(1390).getEmail());
	}

	@Test
	@DisplayName("Record 1391: Web is http://www.hestertaborda.com")
	void WebOfRecord1391() {
		assertEquals("http://www.hestertaborda.com", customers.get(1390).getWeb());
	}
}
