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

@Tag("35")
class Record_4526 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4526: FirstName is Fern")
	void FirstNameOfRecord4526() {
		assertEquals("Fern", customers.get(4525).getFirstName());
	}

	@Test
	@DisplayName("Record 4526: LastName is Tillis")
	void LastNameOfRecord4526() {
		assertEquals("Tillis", customers.get(4525).getLastName());
	}

	@Test
	@DisplayName("Record 4526: Company is Expertise Word Processing Svc")
	void CompanyOfRecord4526() {
		assertEquals("Expertise Word Processing Svc", customers.get(4525).getCompany());
	}

	@Test
	@DisplayName("Record 4526: Address is 4330 Pond Rd")
	void AddressOfRecord4526() {
		assertEquals("4330 Pond Rd", customers.get(4525).getAddress());
	}

	@Test
	@DisplayName("Record 4526: City is Burlington")
	void CityOfRecord4526() {
		assertEquals("Burlington", customers.get(4525).getCity());
	}

	@Test
	@DisplayName("Record 4526: County is Alamance")
	void CountyOfRecord4526() {
		assertEquals("Alamance", customers.get(4525).getCounty());
	}

	@Test
	@DisplayName("Record 4526: State is NC")
	void StateOfRecord4526() {
		assertEquals("NC", customers.get(4525).getState());
	}

	@Test
	@DisplayName("Record 4526: ZIP is 27215")
	void ZIPOfRecord4526() {
		assertEquals("27215", customers.get(4525).getZIP());
	}

	@Test
	@DisplayName("Record 4526: Phone is 336-538-9176")
	void PhoneOfRecord4526() {
		assertEquals("336-538-9176", customers.get(4525).getPhone());
	}

	@Test
	@DisplayName("Record 4526: Fax is 336-538-5565")
	void FaxOfRecord4526() {
		assertEquals("336-538-5565", customers.get(4525).getFax());
	}

	@Test
	@DisplayName("Record 4526: Email is fern@tillis.com")
	void EmailOfRecord4526() {
		assertEquals("fern@tillis.com", customers.get(4525).getEmail());
	}

	@Test
	@DisplayName("Record 4526: Web is http://www.ferntillis.com")
	void WebOfRecord4526() {
		assertEquals("http://www.ferntillis.com", customers.get(4525).getWeb());
	}
}
