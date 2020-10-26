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

@Tag("44")
class Record_4146 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4146: FirstName is Shayla")
	void FirstNameOfRecord4146() {
		assertEquals("Shayla", customers.get(4145).getFirstName());
	}

	@Test
	@DisplayName("Record 4146: LastName is Muccigrosso")
	void LastNameOfRecord4146() {
		assertEquals("Muccigrosso", customers.get(4145).getLastName());
	}

	@Test
	@DisplayName("Record 4146: Company is Snider Auto Parts")
	void CompanyOfRecord4146() {
		assertEquals("Snider Auto Parts", customers.get(4145).getCompany());
	}

	@Test
	@DisplayName("Record 4146: Address is 140 Everett Ave")
	void AddressOfRecord4146() {
		assertEquals("140 Everett Ave", customers.get(4145).getAddress());
	}

	@Test
	@DisplayName("Record 4146: City is Newark")
	void CityOfRecord4146() {
		assertEquals("Newark", customers.get(4145).getCity());
	}

	@Test
	@DisplayName("Record 4146: County is Licking")
	void CountyOfRecord4146() {
		assertEquals("Licking", customers.get(4145).getCounty());
	}

	@Test
	@DisplayName("Record 4146: State is OH")
	void StateOfRecord4146() {
		assertEquals("OH", customers.get(4145).getState());
	}

	@Test
	@DisplayName("Record 4146: ZIP is 43055")
	void ZIPOfRecord4146() {
		assertEquals("43055", customers.get(4145).getZIP());
	}

	@Test
	@DisplayName("Record 4146: Phone is 740-349-2407")
	void PhoneOfRecord4146() {
		assertEquals("740-349-2407", customers.get(4145).getPhone());
	}

	@Test
	@DisplayName("Record 4146: Fax is 740-349-7122")
	void FaxOfRecord4146() {
		assertEquals("740-349-7122", customers.get(4145).getFax());
	}

	@Test
	@DisplayName("Record 4146: Email is shayla@muccigrosso.com")
	void EmailOfRecord4146() {
		assertEquals("shayla@muccigrosso.com", customers.get(4145).getEmail());
	}

	@Test
	@DisplayName("Record 4146: Web is http://www.shaylamuccigrosso.com")
	void WebOfRecord4146() {
		assertEquals("http://www.shaylamuccigrosso.com", customers.get(4145).getWeb());
	}
}
