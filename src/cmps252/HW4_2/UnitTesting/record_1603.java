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
class Record_1603 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1603: FirstName is Philip")
	void FirstNameOfRecord1603() {
		assertEquals("Philip", customers.get(1602).getFirstName());
	}

	@Test
	@DisplayName("Record 1603: LastName is Cassaro")
	void LastNameOfRecord1603() {
		assertEquals("Cassaro", customers.get(1602).getLastName());
	}

	@Test
	@DisplayName("Record 1603: Company is Leone, Edward S Esq")
	void CompanyOfRecord1603() {
		assertEquals("Leone, Edward S Esq", customers.get(1602).getCompany());
	}

	@Test
	@DisplayName("Record 1603: Address is 5 Erie Plz")
	void AddressOfRecord1603() {
		assertEquals("5 Erie Plz", customers.get(1602).getAddress());
	}

	@Test
	@DisplayName("Record 1603: City is Ramsey")
	void CityOfRecord1603() {
		assertEquals("Ramsey", customers.get(1602).getCity());
	}

	@Test
	@DisplayName("Record 1603: County is Bergen")
	void CountyOfRecord1603() {
		assertEquals("Bergen", customers.get(1602).getCounty());
	}

	@Test
	@DisplayName("Record 1603: State is NJ")
	void StateOfRecord1603() {
		assertEquals("NJ", customers.get(1602).getState());
	}

	@Test
	@DisplayName("Record 1603: ZIP is 7446")
	void ZIPOfRecord1603() {
		assertEquals("7446", customers.get(1602).getZIP());
	}

	@Test
	@DisplayName("Record 1603: Phone is 201-327-0091")
	void PhoneOfRecord1603() {
		assertEquals("201-327-0091", customers.get(1602).getPhone());
	}

	@Test
	@DisplayName("Record 1603: Fax is 201-327-0702")
	void FaxOfRecord1603() {
		assertEquals("201-327-0702", customers.get(1602).getFax());
	}

	@Test
	@DisplayName("Record 1603: Email is philip@cassaro.com")
	void EmailOfRecord1603() {
		assertEquals("philip@cassaro.com", customers.get(1602).getEmail());
	}

	@Test
	@DisplayName("Record 1603: Web is http://www.philipcassaro.com")
	void WebOfRecord1603() {
		assertEquals("http://www.philipcassaro.com", customers.get(1602).getWeb());
	}
}
