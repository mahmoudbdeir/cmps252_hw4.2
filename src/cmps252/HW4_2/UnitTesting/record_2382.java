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

@Tag("15")
class Record_2382 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2382: FirstName is Mabel")
	void FirstNameOfRecord2382() {
		assertEquals("Mabel", customers.get(2381).getFirstName());
	}

	@Test
	@DisplayName("Record 2382: LastName is Zavits")
	void LastNameOfRecord2382() {
		assertEquals("Zavits", customers.get(2381).getLastName());
	}

	@Test
	@DisplayName("Record 2382: Company is Parsons Agency")
	void CompanyOfRecord2382() {
		assertEquals("Parsons Agency", customers.get(2381).getCompany());
	}

	@Test
	@DisplayName("Record 2382: Address is Old Epsom Rd")
	void AddressOfRecord2382() {
		assertEquals("Old Epsom Rd", customers.get(2381).getAddress());
	}

	@Test
	@DisplayName("Record 2382: City is Henderson")
	void CityOfRecord2382() {
		assertEquals("Henderson", customers.get(2381).getCity());
	}

	@Test
	@DisplayName("Record 2382: County is Vance")
	void CountyOfRecord2382() {
		assertEquals("Vance", customers.get(2381).getCounty());
	}

	@Test
	@DisplayName("Record 2382: State is NC")
	void StateOfRecord2382() {
		assertEquals("NC", customers.get(2381).getState());
	}

	@Test
	@DisplayName("Record 2382: ZIP is 27536")
	void ZIPOfRecord2382() {
		assertEquals("27536", customers.get(2381).getZIP());
	}

	@Test
	@DisplayName("Record 2382: Phone is 252-492-7129")
	void PhoneOfRecord2382() {
		assertEquals("252-492-7129", customers.get(2381).getPhone());
	}

	@Test
	@DisplayName("Record 2382: Fax is 252-492-4722")
	void FaxOfRecord2382() {
		assertEquals("252-492-4722", customers.get(2381).getFax());
	}

	@Test
	@DisplayName("Record 2382: Email is mabel@zavits.com")
	void EmailOfRecord2382() {
		assertEquals("mabel@zavits.com", customers.get(2381).getEmail());
	}

	@Test
	@DisplayName("Record 2382: Web is http://www.mabelzavits.com")
	void WebOfRecord2382() {
		assertEquals("http://www.mabelzavits.com", customers.get(2381).getWeb());
	}
}
