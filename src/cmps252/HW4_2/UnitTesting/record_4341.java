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

@Tag("28")
class Record_4341 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4341: FirstName is Hyman")
	void FirstNameOfRecord4341() {
		assertEquals("Hyman", customers.get(4340).getFirstName());
	}

	@Test
	@DisplayName("Record 4341: LastName is Feltmann")
	void LastNameOfRecord4341() {
		assertEquals("Feltmann", customers.get(4340).getLastName());
	}

	@Test
	@DisplayName("Record 4341: Company is Palo Cedro Printing")
	void CompanyOfRecord4341() {
		assertEquals("Palo Cedro Printing", customers.get(4340).getCompany());
	}

	@Test
	@DisplayName("Record 4341: Address is 39 Hudson St")
	void AddressOfRecord4341() {
		assertEquals("39 Hudson St", customers.get(4340).getAddress());
	}

	@Test
	@DisplayName("Record 4341: City is Hackensack")
	void CityOfRecord4341() {
		assertEquals("Hackensack", customers.get(4340).getCity());
	}

	@Test
	@DisplayName("Record 4341: County is Bergen")
	void CountyOfRecord4341() {
		assertEquals("Bergen", customers.get(4340).getCounty());
	}

	@Test
	@DisplayName("Record 4341: State is NJ")
	void StateOfRecord4341() {
		assertEquals("NJ", customers.get(4340).getState());
	}

	@Test
	@DisplayName("Record 4341: ZIP is 7601")
	void ZIPOfRecord4341() {
		assertEquals("7601", customers.get(4340).getZIP());
	}

	@Test
	@DisplayName("Record 4341: Phone is 201-489-7179")
	void PhoneOfRecord4341() {
		assertEquals("201-489-7179", customers.get(4340).getPhone());
	}

	@Test
	@DisplayName("Record 4341: Fax is 201-489-6746")
	void FaxOfRecord4341() {
		assertEquals("201-489-6746", customers.get(4340).getFax());
	}

	@Test
	@DisplayName("Record 4341: Email is hyman@feltmann.com")
	void EmailOfRecord4341() {
		assertEquals("hyman@feltmann.com", customers.get(4340).getEmail());
	}

	@Test
	@DisplayName("Record 4341: Web is http://www.hymanfeltmann.com")
	void WebOfRecord4341() {
		assertEquals("http://www.hymanfeltmann.com", customers.get(4340).getWeb());
	}
}
