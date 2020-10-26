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

@Tag("33")
class Record_4567 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4567: FirstName is Rodney")
	void FirstNameOfRecord4567() {
		assertEquals("Rodney", customers.get(4566).getFirstName());
	}

	@Test
	@DisplayName("Record 4567: LastName is Nehls")
	void LastNameOfRecord4567() {
		assertEquals("Nehls", customers.get(4566).getLastName());
	}

	@Test
	@DisplayName("Record 4567: Company is Ortec International Inc")
	void CompanyOfRecord4567() {
		assertEquals("Ortec International Inc", customers.get(4566).getCompany());
	}

	@Test
	@DisplayName("Record 4567: Address is 3210 Grace St Nw")
	void AddressOfRecord4567() {
		assertEquals("3210 Grace St Nw", customers.get(4566).getAddress());
	}

	@Test
	@DisplayName("Record 4567: City is Washington")
	void CityOfRecord4567() {
		assertEquals("Washington", customers.get(4566).getCity());
	}

	@Test
	@DisplayName("Record 4567: County is District of Columbia")
	void CountyOfRecord4567() {
		assertEquals("District of Columbia", customers.get(4566).getCounty());
	}

	@Test
	@DisplayName("Record 4567: State is DC")
	void StateOfRecord4567() {
		assertEquals("DC", customers.get(4566).getState());
	}

	@Test
	@DisplayName("Record 4567: ZIP is 20007")
	void ZIPOfRecord4567() {
		assertEquals("20007", customers.get(4566).getZIP());
	}

	@Test
	@DisplayName("Record 4567: Phone is 202-342-3897")
	void PhoneOfRecord4567() {
		assertEquals("202-342-3897", customers.get(4566).getPhone());
	}

	@Test
	@DisplayName("Record 4567: Fax is 202-342-9642")
	void FaxOfRecord4567() {
		assertEquals("202-342-9642", customers.get(4566).getFax());
	}

	@Test
	@DisplayName("Record 4567: Email is rodney@nehls.com")
	void EmailOfRecord4567() {
		assertEquals("rodney@nehls.com", customers.get(4566).getEmail());
	}

	@Test
	@DisplayName("Record 4567: Web is http://www.rodneynehls.com")
	void WebOfRecord4567() {
		assertEquals("http://www.rodneynehls.com", customers.get(4566).getWeb());
	}
}
