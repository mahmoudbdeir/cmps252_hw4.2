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

@Tag("20")
class Record_3151 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3151: FirstName is Mohammed")
	void FirstNameOfRecord3151() {
		assertEquals("Mohammed", customers.get(3150).getFirstName());
	}

	@Test
	@DisplayName("Record 3151: LastName is Clayton")
	void LastNameOfRecord3151() {
		assertEquals("Clayton", customers.get(3150).getLastName());
	}

	@Test
	@DisplayName("Record 3151: Company is Campisano, Richard N Esq")
	void CompanyOfRecord3151() {
		assertEquals("Campisano, Richard N Esq", customers.get(3150).getCompany());
	}

	@Test
	@DisplayName("Record 3151: Address is 3030 Huron St")
	void AddressOfRecord3151() {
		assertEquals("3030 Huron St", customers.get(3150).getAddress());
	}

	@Test
	@DisplayName("Record 3151: City is Denver")
	void CityOfRecord3151() {
		assertEquals("Denver", customers.get(3150).getCity());
	}

	@Test
	@DisplayName("Record 3151: County is Denver")
	void CountyOfRecord3151() {
		assertEquals("Denver", customers.get(3150).getCounty());
	}

	@Test
	@DisplayName("Record 3151: State is CO")
	void StateOfRecord3151() {
		assertEquals("CO", customers.get(3150).getState());
	}

	@Test
	@DisplayName("Record 3151: ZIP is 80202")
	void ZIPOfRecord3151() {
		assertEquals("80202", customers.get(3150).getZIP());
	}

	@Test
	@DisplayName("Record 3151: Phone is 303-296-3319")
	void PhoneOfRecord3151() {
		assertEquals("303-296-3319", customers.get(3150).getPhone());
	}

	@Test
	@DisplayName("Record 3151: Fax is 303-296-9827")
	void FaxOfRecord3151() {
		assertEquals("303-296-9827", customers.get(3150).getFax());
	}

	@Test
	@DisplayName("Record 3151: Email is mohammed@clayton.com")
	void EmailOfRecord3151() {
		assertEquals("mohammed@clayton.com", customers.get(3150).getEmail());
	}

	@Test
	@DisplayName("Record 3151: Web is http://www.mohammedclayton.com")
	void WebOfRecord3151() {
		assertEquals("http://www.mohammedclayton.com", customers.get(3150).getWeb());
	}
}
