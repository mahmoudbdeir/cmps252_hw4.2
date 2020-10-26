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

@Tag("7")
class Record_4880 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4880: FirstName is Darron")
	void FirstNameOfRecord4880() {
		assertEquals("Darron", customers.get(4879).getFirstName());
	}

	@Test
	@DisplayName("Record 4880: LastName is Cichowski")
	void LastNameOfRecord4880() {
		assertEquals("Cichowski", customers.get(4879).getLastName());
	}

	@Test
	@DisplayName("Record 4880: Company is Firstline Office Supply Inc")
	void CompanyOfRecord4880() {
		assertEquals("Firstline Office Supply Inc", customers.get(4879).getCompany());
	}

	@Test
	@DisplayName("Record 4880: Address is 2307 Oakdale Rd")
	void AddressOfRecord4880() {
		assertEquals("2307 Oakdale Rd", customers.get(4879).getAddress());
	}

	@Test
	@DisplayName("Record 4880: City is Modesto")
	void CityOfRecord4880() {
		assertEquals("Modesto", customers.get(4879).getCity());
	}

	@Test
	@DisplayName("Record 4880: County is Stanislaus")
	void CountyOfRecord4880() {
		assertEquals("Stanislaus", customers.get(4879).getCounty());
	}

	@Test
	@DisplayName("Record 4880: State is CA")
	void StateOfRecord4880() {
		assertEquals("CA", customers.get(4879).getState());
	}

	@Test
	@DisplayName("Record 4880: ZIP is 95355")
	void ZIPOfRecord4880() {
		assertEquals("95355", customers.get(4879).getZIP());
	}

	@Test
	@DisplayName("Record 4880: Phone is 209-551-6190")
	void PhoneOfRecord4880() {
		assertEquals("209-551-6190", customers.get(4879).getPhone());
	}

	@Test
	@DisplayName("Record 4880: Fax is 209-551-7034")
	void FaxOfRecord4880() {
		assertEquals("209-551-7034", customers.get(4879).getFax());
	}

	@Test
	@DisplayName("Record 4880: Email is darron@cichowski.com")
	void EmailOfRecord4880() {
		assertEquals("darron@cichowski.com", customers.get(4879).getEmail());
	}

	@Test
	@DisplayName("Record 4880: Web is http://www.darroncichowski.com")
	void WebOfRecord4880() {
		assertEquals("http://www.darroncichowski.com", customers.get(4879).getWeb());
	}
}
