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

@Tag("6")
class Record_3204 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3204: FirstName is Lenora")
	void FirstNameOfRecord3204() {
		assertEquals("Lenora", customers.get(3203).getFirstName());
	}

	@Test
	@DisplayName("Record 3204: LastName is Laxton")
	void LastNameOfRecord3204() {
		assertEquals("Laxton", customers.get(3203).getLastName());
	}

	@Test
	@DisplayName("Record 3204: Company is Missouri Forest Products Assn")
	void CompanyOfRecord3204() {
		assertEquals("Missouri Forest Products Assn", customers.get(3203).getCompany());
	}

	@Test
	@DisplayName("Record 3204: Address is 100 Industry Ln")
	void AddressOfRecord3204() {
		assertEquals("100 Industry Ln", customers.get(3203).getAddress());
	}

	@Test
	@DisplayName("Record 3204: City is Cockeysville")
	void CityOfRecord3204() {
		assertEquals("Cockeysville", customers.get(3203).getCity());
	}

	@Test
	@DisplayName("Record 3204: County is Baltimore")
	void CountyOfRecord3204() {
		assertEquals("Baltimore", customers.get(3203).getCounty());
	}

	@Test
	@DisplayName("Record 3204: State is MD")
	void StateOfRecord3204() {
		assertEquals("MD", customers.get(3203).getState());
	}

	@Test
	@DisplayName("Record 3204: ZIP is 21030")
	void ZIPOfRecord3204() {
		assertEquals("21030", customers.get(3203).getZIP());
	}

	@Test
	@DisplayName("Record 3204: Phone is 410-628-7922")
	void PhoneOfRecord3204() {
		assertEquals("410-628-7922", customers.get(3203).getPhone());
	}

	@Test
	@DisplayName("Record 3204: Fax is 410-628-5227")
	void FaxOfRecord3204() {
		assertEquals("410-628-5227", customers.get(3203).getFax());
	}

	@Test
	@DisplayName("Record 3204: Email is lenora@laxton.com")
	void EmailOfRecord3204() {
		assertEquals("lenora@laxton.com", customers.get(3203).getEmail());
	}

	@Test
	@DisplayName("Record 3204: Web is http://www.lenoralaxton.com")
	void WebOfRecord3204() {
		assertEquals("http://www.lenoralaxton.com", customers.get(3203).getWeb());
	}
}
