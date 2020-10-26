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

@Tag("5")
class Record_4412 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4412: FirstName is Matilda")
	void FirstNameOfRecord4412() {
		assertEquals("Matilda", customers.get(4411).getFirstName());
	}

	@Test
	@DisplayName("Record 4412: LastName is Beabout")
	void LastNameOfRecord4412() {
		assertEquals("Beabout", customers.get(4411).getLastName());
	}

	@Test
	@DisplayName("Record 4412: Company is May Cape County Offices & Inst")
	void CompanyOfRecord4412() {
		assertEquals("May Cape County Offices & Inst", customers.get(4411).getCompany());
	}

	@Test
	@DisplayName("Record 4412: Address is 250 W Pratt St")
	void AddressOfRecord4412() {
		assertEquals("250 W Pratt St", customers.get(4411).getAddress());
	}

	@Test
	@DisplayName("Record 4412: City is Baltimore")
	void CityOfRecord4412() {
		assertEquals("Baltimore", customers.get(4411).getCity());
	}

	@Test
	@DisplayName("Record 4412: County is Baltimore City")
	void CountyOfRecord4412() {
		assertEquals("Baltimore City", customers.get(4411).getCounty());
	}

	@Test
	@DisplayName("Record 4412: State is MD")
	void StateOfRecord4412() {
		assertEquals("MD", customers.get(4411).getState());
	}

	@Test
	@DisplayName("Record 4412: ZIP is 21201")
	void ZIPOfRecord4412() {
		assertEquals("21201", customers.get(4411).getZIP());
	}

	@Test
	@DisplayName("Record 4412: Phone is 410-659-0150")
	void PhoneOfRecord4412() {
		assertEquals("410-659-0150", customers.get(4411).getPhone());
	}

	@Test
	@DisplayName("Record 4412: Fax is 410-659-2548")
	void FaxOfRecord4412() {
		assertEquals("410-659-2548", customers.get(4411).getFax());
	}

	@Test
	@DisplayName("Record 4412: Email is matilda@beabout.com")
	void EmailOfRecord4412() {
		assertEquals("matilda@beabout.com", customers.get(4411).getEmail());
	}

	@Test
	@DisplayName("Record 4412: Web is http://www.matildabeabout.com")
	void WebOfRecord4412() {
		assertEquals("http://www.matildabeabout.com", customers.get(4411).getWeb());
	}
}
