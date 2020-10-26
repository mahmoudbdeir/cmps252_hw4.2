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

@Tag("1")
class Record_4344 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4344: FirstName is Shelby")
	void FirstNameOfRecord4344() {
		assertEquals("Shelby", customers.get(4343).getFirstName());
	}

	@Test
	@DisplayName("Record 4344: LastName is Shafer")
	void LastNameOfRecord4344() {
		assertEquals("Shafer", customers.get(4343).getLastName());
	}

	@Test
	@DisplayName("Record 4344: Company is Express Framing")
	void CompanyOfRecord4344() {
		assertEquals("Express Framing", customers.get(4343).getCompany());
	}

	@Test
	@DisplayName("Record 4344: Address is 150 Fayetteville Street Mall")
	void AddressOfRecord4344() {
		assertEquals("150 Fayetteville Street Mall", customers.get(4343).getAddress());
	}

	@Test
	@DisplayName("Record 4344: City is Ralygh")
	void CityOfRecord4344() {
		assertEquals("Ralygh", customers.get(4343).getCity());
	}

	@Test
	@DisplayName("Record 4344: County is Wake")
	void CountyOfRecord4344() {
		assertEquals("Wake", customers.get(4343).getCounty());
	}

	@Test
	@DisplayName("Record 4344: State is NC")
	void StateOfRecord4344() {
		assertEquals("NC", customers.get(4343).getState());
	}

	@Test
	@DisplayName("Record 4344: ZIP is 27601")
	void ZIPOfRecord4344() {
		assertEquals("27601", customers.get(4343).getZIP());
	}

	@Test
	@DisplayName("Record 4344: Phone is 919-833-4221")
	void PhoneOfRecord4344() {
		assertEquals("919-833-4221", customers.get(4343).getPhone());
	}

	@Test
	@DisplayName("Record 4344: Fax is 919-833-0264")
	void FaxOfRecord4344() {
		assertEquals("919-833-0264", customers.get(4343).getFax());
	}

	@Test
	@DisplayName("Record 4344: Email is shelby@shafer.com")
	void EmailOfRecord4344() {
		assertEquals("shelby@shafer.com", customers.get(4343).getEmail());
	}

	@Test
	@DisplayName("Record 4344: Web is http://www.shelbyshafer.com")
	void WebOfRecord4344() {
		assertEquals("http://www.shelbyshafer.com", customers.get(4343).getWeb());
	}
}
