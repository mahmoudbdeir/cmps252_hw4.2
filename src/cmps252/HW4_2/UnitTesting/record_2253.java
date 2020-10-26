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

@Tag("30")
class Record_2253 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2253: FirstName is Diane")
	void FirstNameOfRecord2253() {
		assertEquals("Diane", customers.get(2252).getFirstName());
	}

	@Test
	@DisplayName("Record 2253: LastName is Lynch")
	void LastNameOfRecord2253() {
		assertEquals("Lynch", customers.get(2252).getLastName());
	}

	@Test
	@DisplayName("Record 2253: Company is Trc Electronics Inc")
	void CompanyOfRecord2253() {
		assertEquals("Trc Electronics Inc", customers.get(2252).getCompany());
	}

	@Test
	@DisplayName("Record 2253: Address is 500 Carteret St")
	void AddressOfRecord2253() {
		assertEquals("500 Carteret St", customers.get(2252).getAddress());
	}

	@Test
	@DisplayName("Record 2253: City is Beaufort")
	void CityOfRecord2253() {
		assertEquals("Beaufort", customers.get(2252).getCity());
	}

	@Test
	@DisplayName("Record 2253: County is Beaufort")
	void CountyOfRecord2253() {
		assertEquals("Beaufort", customers.get(2252).getCounty());
	}

	@Test
	@DisplayName("Record 2253: State is SC")
	void StateOfRecord2253() {
		assertEquals("SC", customers.get(2252).getState());
	}

	@Test
	@DisplayName("Record 2253: ZIP is 29902")
	void ZIPOfRecord2253() {
		assertEquals("29902", customers.get(2252).getZIP());
	}

	@Test
	@DisplayName("Record 2253: Phone is 843-522-6874")
	void PhoneOfRecord2253() {
		assertEquals("843-522-6874", customers.get(2252).getPhone());
	}

	@Test
	@DisplayName("Record 2253: Fax is 843-522-9463")
	void FaxOfRecord2253() {
		assertEquals("843-522-9463", customers.get(2252).getFax());
	}

	@Test
	@DisplayName("Record 2253: Email is diane@lynch.com")
	void EmailOfRecord2253() {
		assertEquals("diane@lynch.com", customers.get(2252).getEmail());
	}

	@Test
	@DisplayName("Record 2253: Web is http://www.dianelynch.com")
	void WebOfRecord2253() {
		assertEquals("http://www.dianelynch.com", customers.get(2252).getWeb());
	}
}
