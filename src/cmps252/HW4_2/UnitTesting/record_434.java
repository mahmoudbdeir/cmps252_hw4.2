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

@Tag("39")
class Record_434 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 434: FirstName is Stevie")
	void FirstNameOfRecord434() {
		assertEquals("Stevie", customers.get(433).getFirstName());
	}

	@Test
	@DisplayName("Record 434: LastName is Defoor")
	void LastNameOfRecord434() {
		assertEquals("Defoor", customers.get(433).getLastName());
	}

	@Test
	@DisplayName("Record 434: Company is Easy Check Cashing")
	void CompanyOfRecord434() {
		assertEquals("Easy Check Cashing", customers.get(433).getCompany());
	}

	@Test
	@DisplayName("Record 434: Address is Rte 209")
	void AddressOfRecord434() {
		assertEquals("Rte 209", customers.get(433).getAddress());
	}

	@Test
	@DisplayName("Record 434: City is Marshalls Creek")
	void CityOfRecord434() {
		assertEquals("Marshalls Creek", customers.get(433).getCity());
	}

	@Test
	@DisplayName("Record 434: County is Monroe")
	void CountyOfRecord434() {
		assertEquals("Monroe", customers.get(433).getCounty());
	}

	@Test
	@DisplayName("Record 434: State is PA")
	void StateOfRecord434() {
		assertEquals("PA", customers.get(433).getState());
	}

	@Test
	@DisplayName("Record 434: ZIP is 18335")
	void ZIPOfRecord434() {
		assertEquals("18335", customers.get(433).getZIP());
	}

	@Test
	@DisplayName("Record 434: Phone is 570-424-4754")
	void PhoneOfRecord434() {
		assertEquals("570-424-4754", customers.get(433).getPhone());
	}

	@Test
	@DisplayName("Record 434: Fax is 570-424-4508")
	void FaxOfRecord434() {
		assertEquals("570-424-4508", customers.get(433).getFax());
	}

	@Test
	@DisplayName("Record 434: Email is stevie@defoor.com")
	void EmailOfRecord434() {
		assertEquals("stevie@defoor.com", customers.get(433).getEmail());
	}

	@Test
	@DisplayName("Record 434: Web is http://www.steviedefoor.com")
	void WebOfRecord434() {
		assertEquals("http://www.steviedefoor.com", customers.get(433).getWeb());
	}
}
