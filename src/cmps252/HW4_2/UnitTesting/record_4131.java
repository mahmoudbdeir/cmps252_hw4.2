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

@Tag("36")
class Record_4131 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4131: FirstName is Katheryn")
	void FirstNameOfRecord4131() {
		assertEquals("Katheryn", customers.get(4130).getFirstName());
	}

	@Test
	@DisplayName("Record 4131: LastName is Vanderlinden")
	void LastNameOfRecord4131() {
		assertEquals("Vanderlinden", customers.get(4130).getLastName());
	}

	@Test
	@DisplayName("Record 4131: Company is Rich Gelwarg & Lampf Cpas")
	void CompanyOfRecord4131() {
		assertEquals("Rich Gelwarg & Lampf Cpas", customers.get(4130).getCompany());
	}

	@Test
	@DisplayName("Record 4131: Address is 9 Romanelli Ave")
	void AddressOfRecord4131() {
		assertEquals("9 Romanelli Ave", customers.get(4130).getAddress());
	}

	@Test
	@DisplayName("Record 4131: City is South Hackensack")
	void CityOfRecord4131() {
		assertEquals("South Hackensack", customers.get(4130).getCity());
	}

	@Test
	@DisplayName("Record 4131: County is Bergen")
	void CountyOfRecord4131() {
		assertEquals("Bergen", customers.get(4130).getCounty());
	}

	@Test
	@DisplayName("Record 4131: State is NJ")
	void StateOfRecord4131() {
		assertEquals("NJ", customers.get(4130).getState());
	}

	@Test
	@DisplayName("Record 4131: ZIP is 7606")
	void ZIPOfRecord4131() {
		assertEquals("7606", customers.get(4130).getZIP());
	}

	@Test
	@DisplayName("Record 4131: Phone is 201-487-3457")
	void PhoneOfRecord4131() {
		assertEquals("201-487-3457", customers.get(4130).getPhone());
	}

	@Test
	@DisplayName("Record 4131: Fax is 201-487-3724")
	void FaxOfRecord4131() {
		assertEquals("201-487-3724", customers.get(4130).getFax());
	}

	@Test
	@DisplayName("Record 4131: Email is katheryn@vanderlinden.com")
	void EmailOfRecord4131() {
		assertEquals("katheryn@vanderlinden.com", customers.get(4130).getEmail());
	}

	@Test
	@DisplayName("Record 4131: Web is http://www.katherynvanderlinden.com")
	void WebOfRecord4131() {
		assertEquals("http://www.katherynvanderlinden.com", customers.get(4130).getWeb());
	}
}
