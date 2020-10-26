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

@Tag("24")
class Record_4096 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4096: FirstName is Clara")
	void FirstNameOfRecord4096() {
		assertEquals("Clara", customers.get(4095).getFirstName());
	}

	@Test
	@DisplayName("Record 4096: LastName is Wishon")
	void LastNameOfRecord4096() {
		assertEquals("Wishon", customers.get(4095).getLastName());
	}

	@Test
	@DisplayName("Record 4096: Company is Hodkinson, Kehrela M Esq")
	void CompanyOfRecord4096() {
		assertEquals("Hodkinson, Kehrela M Esq", customers.get(4095).getCompany());
	}

	@Test
	@DisplayName("Record 4096: Address is 175 Hudson St")
	void AddressOfRecord4096() {
		assertEquals("175 Hudson St", customers.get(4095).getAddress());
	}

	@Test
	@DisplayName("Record 4096: City is Hackensack")
	void CityOfRecord4096() {
		assertEquals("Hackensack", customers.get(4095).getCity());
	}

	@Test
	@DisplayName("Record 4096: County is Bergen")
	void CountyOfRecord4096() {
		assertEquals("Bergen", customers.get(4095).getCounty());
	}

	@Test
	@DisplayName("Record 4096: State is NJ")
	void StateOfRecord4096() {
		assertEquals("NJ", customers.get(4095).getState());
	}

	@Test
	@DisplayName("Record 4096: ZIP is 07601")
	void ZIPOfRecord4096() {
		assertEquals("07601", customers.get(4095).getZIP());
	}

	@Test
	@DisplayName("Record 4096: Phone is 201-843-8892")
	void PhoneOfRecord4096() {
		assertEquals("201-843-8892", customers.get(4095).getPhone());
	}

	@Test
	@DisplayName("Record 4096: Fax is 201-843-1155")
	void FaxOfRecord4096() {
		assertEquals("201-843-1155", customers.get(4095).getFax());
	}

	@Test
	@DisplayName("Record 4096: Email is clara@wishon.com")
	void EmailOfRecord4096() {
		assertEquals("clara@wishon.com", customers.get(4095).getEmail());
	}

	@Test
	@DisplayName("Record 4096: Web is http://www.clarawishon.com")
	void WebOfRecord4096() {
		assertEquals("http://www.clarawishon.com", customers.get(4095).getWeb());
	}
}
