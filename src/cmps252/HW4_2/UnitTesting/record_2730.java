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

@Tag("29")
class Record_2730 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2730: FirstName is Deanne")
	void FirstNameOfRecord2730() {
		assertEquals("Deanne", customers.get(2729).getFirstName());
	}

	@Test
	@DisplayName("Record 2730: LastName is Brackbill")
	void LastNameOfRecord2730() {
		assertEquals("Brackbill", customers.get(2729).getLastName());
	}

	@Test
	@DisplayName("Record 2730: Company is Pac Prosthetics & Orthotics")
	void CompanyOfRecord2730() {
		assertEquals("Pac Prosthetics & Orthotics", customers.get(2729).getCompany());
	}

	@Test
	@DisplayName("Record 2730: Address is 225 Fallon Rd")
	void AddressOfRecord2730() {
		assertEquals("225 Fallon Rd", customers.get(2729).getAddress());
	}

	@Test
	@DisplayName("Record 2730: City is Stoneham")
	void CityOfRecord2730() {
		assertEquals("Stoneham", customers.get(2729).getCity());
	}

	@Test
	@DisplayName("Record 2730: County is Middlesex")
	void CountyOfRecord2730() {
		assertEquals("Middlesex", customers.get(2729).getCounty());
	}

	@Test
	@DisplayName("Record 2730: State is MA")
	void StateOfRecord2730() {
		assertEquals("MA", customers.get(2729).getState());
	}

	@Test
	@DisplayName("Record 2730: ZIP is 2180")
	void ZIPOfRecord2730() {
		assertEquals("2180", customers.get(2729).getZIP());
	}

	@Test
	@DisplayName("Record 2730: Phone is 781-438-9525")
	void PhoneOfRecord2730() {
		assertEquals("781-438-9525", customers.get(2729).getPhone());
	}

	@Test
	@DisplayName("Record 2730: Fax is 781-438-5862")
	void FaxOfRecord2730() {
		assertEquals("781-438-5862", customers.get(2729).getFax());
	}

	@Test
	@DisplayName("Record 2730: Email is deanne@brackbill.com")
	void EmailOfRecord2730() {
		assertEquals("deanne@brackbill.com", customers.get(2729).getEmail());
	}

	@Test
	@DisplayName("Record 2730: Web is http://www.deannebrackbill.com")
	void WebOfRecord2730() {
		assertEquals("http://www.deannebrackbill.com", customers.get(2729).getWeb());
	}
}
