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

@Tag("31")
class Record_4224 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4224: FirstName is Teodoro")
	void FirstNameOfRecord4224() {
		assertEquals("Teodoro", customers.get(4223).getFirstName());
	}

	@Test
	@DisplayName("Record 4224: LastName is Harkin")
	void LastNameOfRecord4224() {
		assertEquals("Harkin", customers.get(4223).getLastName());
	}

	@Test
	@DisplayName("Record 4224: Company is Data Tech Services")
	void CompanyOfRecord4224() {
		assertEquals("Data Tech Services", customers.get(4223).getCompany());
	}

	@Test
	@DisplayName("Record 4224: Address is 1320 W 53rd St")
	void AddressOfRecord4224() {
		assertEquals("1320 W 53rd St", customers.get(4223).getAddress());
	}

	@Test
	@DisplayName("Record 4224: City is Anderson")
	void CityOfRecord4224() {
		assertEquals("Anderson", customers.get(4223).getCity());
	}

	@Test
	@DisplayName("Record 4224: County is Madison")
	void CountyOfRecord4224() {
		assertEquals("Madison", customers.get(4223).getCounty());
	}

	@Test
	@DisplayName("Record 4224: State is IN")
	void StateOfRecord4224() {
		assertEquals("IN", customers.get(4223).getState());
	}

	@Test
	@DisplayName("Record 4224: ZIP is 46013")
	void ZIPOfRecord4224() {
		assertEquals("46013", customers.get(4223).getZIP());
	}

	@Test
	@DisplayName("Record 4224: Phone is 765-649-2739")
	void PhoneOfRecord4224() {
		assertEquals("765-649-2739", customers.get(4223).getPhone());
	}

	@Test
	@DisplayName("Record 4224: Fax is 765-649-7519")
	void FaxOfRecord4224() {
		assertEquals("765-649-7519", customers.get(4223).getFax());
	}

	@Test
	@DisplayName("Record 4224: Email is teodoro@harkin.com")
	void EmailOfRecord4224() {
		assertEquals("teodoro@harkin.com", customers.get(4223).getEmail());
	}

	@Test
	@DisplayName("Record 4224: Web is http://www.teodoroharkin.com")
	void WebOfRecord4224() {
		assertEquals("http://www.teodoroharkin.com", customers.get(4223).getWeb());
	}
}
