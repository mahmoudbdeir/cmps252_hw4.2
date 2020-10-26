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

@Tag("7")
class Record_4157 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4157: FirstName is Luisa")
	void FirstNameOfRecord4157() {
		assertEquals("Luisa", customers.get(4156).getFirstName());
	}

	@Test
	@DisplayName("Record 4157: LastName is Menaker")
	void LastNameOfRecord4157() {
		assertEquals("Menaker", customers.get(4156).getLastName());
	}

	@Test
	@DisplayName("Record 4157: Company is Great Southwest Sales")
	void CompanyOfRecord4157() {
		assertEquals("Great Southwest Sales", customers.get(4156).getCompany());
	}

	@Test
	@DisplayName("Record 4157: Address is 14322 Rochelle Dr")
	void AddressOfRecord4157() {
		assertEquals("14322 Rochelle Dr", customers.get(4156).getAddress());
	}

	@Test
	@DisplayName("Record 4157: City is Maple Hyghts")
	void CityOfRecord4157() {
		assertEquals("Maple Hyghts", customers.get(4156).getCity());
	}

	@Test
	@DisplayName("Record 4157: County is Cuyahoga")
	void CountyOfRecord4157() {
		assertEquals("Cuyahoga", customers.get(4156).getCounty());
	}

	@Test
	@DisplayName("Record 4157: State is OH")
	void StateOfRecord4157() {
		assertEquals("OH", customers.get(4156).getState());
	}

	@Test
	@DisplayName("Record 4157: ZIP is 44137")
	void ZIPOfRecord4157() {
		assertEquals("44137", customers.get(4156).getZIP());
	}

	@Test
	@DisplayName("Record 4157: Phone is 216-587-1992")
	void PhoneOfRecord4157() {
		assertEquals("216-587-1992", customers.get(4156).getPhone());
	}

	@Test
	@DisplayName("Record 4157: Fax is 216-587-0078")
	void FaxOfRecord4157() {
		assertEquals("216-587-0078", customers.get(4156).getFax());
	}

	@Test
	@DisplayName("Record 4157: Email is luisa@menaker.com")
	void EmailOfRecord4157() {
		assertEquals("luisa@menaker.com", customers.get(4156).getEmail());
	}

	@Test
	@DisplayName("Record 4157: Web is http://www.luisamenaker.com")
	void WebOfRecord4157() {
		assertEquals("http://www.luisamenaker.com", customers.get(4156).getWeb());
	}
}
