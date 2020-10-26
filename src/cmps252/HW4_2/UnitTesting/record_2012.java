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
class Record_2012 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2012: FirstName is Berta")
	void FirstNameOfRecord2012() {
		assertEquals("Berta", customers.get(2011).getFirstName());
	}

	@Test
	@DisplayName("Record 2012: LastName is Pineau")
	void LastNameOfRecord2012() {
		assertEquals("Pineau", customers.get(2011).getLastName());
	}

	@Test
	@DisplayName("Record 2012: Company is Kernutt, Donald E")
	void CompanyOfRecord2012() {
		assertEquals("Kernutt, Donald E", customers.get(2011).getCompany());
	}

	@Test
	@DisplayName("Record 2012: Address is 2735 E 40th St")
	void AddressOfRecord2012() {
		assertEquals("2735 E 40th St", customers.get(2011).getAddress());
	}

	@Test
	@DisplayName("Record 2012: City is Cleveland")
	void CityOfRecord2012() {
		assertEquals("Cleveland", customers.get(2011).getCity());
	}

	@Test
	@DisplayName("Record 2012: County is Cuyahoga")
	void CountyOfRecord2012() {
		assertEquals("Cuyahoga", customers.get(2011).getCounty());
	}

	@Test
	@DisplayName("Record 2012: State is OH")
	void StateOfRecord2012() {
		assertEquals("OH", customers.get(2011).getState());
	}

	@Test
	@DisplayName("Record 2012: ZIP is 44115")
	void ZIPOfRecord2012() {
		assertEquals("44115", customers.get(2011).getZIP());
	}

	@Test
	@DisplayName("Record 2012: Phone is 216-431-4928")
	void PhoneOfRecord2012() {
		assertEquals("216-431-4928", customers.get(2011).getPhone());
	}

	@Test
	@DisplayName("Record 2012: Fax is 216-431-3504")
	void FaxOfRecord2012() {
		assertEquals("216-431-3504", customers.get(2011).getFax());
	}

	@Test
	@DisplayName("Record 2012: Email is berta@pineau.com")
	void EmailOfRecord2012() {
		assertEquals("berta@pineau.com", customers.get(2011).getEmail());
	}

	@Test
	@DisplayName("Record 2012: Web is http://www.bertapineau.com")
	void WebOfRecord2012() {
		assertEquals("http://www.bertapineau.com", customers.get(2011).getWeb());
	}
}
