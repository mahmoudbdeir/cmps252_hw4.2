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

@Tag("43")
class Record_2917 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2917: FirstName is Elva")
	void FirstNameOfRecord2917() {
		assertEquals("Elva", customers.get(2916).getFirstName());
	}

	@Test
	@DisplayName("Record 2917: LastName is Failde")
	void LastNameOfRecord2917() {
		assertEquals("Failde", customers.get(2916).getLastName());
	}

	@Test
	@DisplayName("Record 2917: Company is Kyr, James M Esq")
	void CompanyOfRecord2917() {
		assertEquals("Kyr, James M Esq", customers.get(2916).getCompany());
	}

	@Test
	@DisplayName("Record 2917: Address is 5621 Duluth St")
	void AddressOfRecord2917() {
		assertEquals("5621 Duluth St", customers.get(2916).getAddress());
	}

	@Test
	@DisplayName("Record 2917: City is Minneapolis")
	void CityOfRecord2917() {
		assertEquals("Minneapolis", customers.get(2916).getCity());
	}

	@Test
	@DisplayName("Record 2917: County is Hennepin")
	void CountyOfRecord2917() {
		assertEquals("Hennepin", customers.get(2916).getCounty());
	}

	@Test
	@DisplayName("Record 2917: State is MN")
	void StateOfRecord2917() {
		assertEquals("MN", customers.get(2916).getState());
	}

	@Test
	@DisplayName("Record 2917: ZIP is 55422")
	void ZIPOfRecord2917() {
		assertEquals("55422", customers.get(2916).getZIP());
	}

	@Test
	@DisplayName("Record 2917: Phone is 763-542-4900")
	void PhoneOfRecord2917() {
		assertEquals("763-542-4900", customers.get(2916).getPhone());
	}

	@Test
	@DisplayName("Record 2917: Fax is 763-542-1396")
	void FaxOfRecord2917() {
		assertEquals("763-542-1396", customers.get(2916).getFax());
	}

	@Test
	@DisplayName("Record 2917: Email is elva@failde.com")
	void EmailOfRecord2917() {
		assertEquals("elva@failde.com", customers.get(2916).getEmail());
	}

	@Test
	@DisplayName("Record 2917: Web is http://www.elvafailde.com")
	void WebOfRecord2917() {
		assertEquals("http://www.elvafailde.com", customers.get(2916).getWeb());
	}
}
