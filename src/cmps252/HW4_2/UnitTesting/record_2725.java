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

@Tag("0")
class Record_2725 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2725: FirstName is Dawn")
	void FirstNameOfRecord2725() {
		assertEquals("Dawn", customers.get(2724).getFirstName());
	}

	@Test
	@DisplayName("Record 2725: LastName is Baydal")
	void LastNameOfRecord2725() {
		assertEquals("Baydal", customers.get(2724).getLastName());
	}

	@Test
	@DisplayName("Record 2725: Company is Shaff, David O Esq")
	void CompanyOfRecord2725() {
		assertEquals("Shaff, David O Esq", customers.get(2724).getCompany());
	}

	@Test
	@DisplayName("Record 2725: Address is 7373 Brookcrest Dr")
	void AddressOfRecord2725() {
		assertEquals("7373 Brookcrest Dr", customers.get(2724).getAddress());
	}

	@Test
	@DisplayName("Record 2725: City is Cincinnati")
	void CityOfRecord2725() {
		assertEquals("Cincinnati", customers.get(2724).getCity());
	}

	@Test
	@DisplayName("Record 2725: County is Hamilton")
	void CountyOfRecord2725() {
		assertEquals("Hamilton", customers.get(2724).getCounty());
	}

	@Test
	@DisplayName("Record 2725: State is OH")
	void StateOfRecord2725() {
		assertEquals("OH", customers.get(2724).getState());
	}

	@Test
	@DisplayName("Record 2725: ZIP is 45237")
	void ZIPOfRecord2725() {
		assertEquals("45237", customers.get(2724).getZIP());
	}

	@Test
	@DisplayName("Record 2725: Phone is 513-366-3277")
	void PhoneOfRecord2725() {
		assertEquals("513-366-3277", customers.get(2724).getPhone());
	}

	@Test
	@DisplayName("Record 2725: Fax is 513-366-1126")
	void FaxOfRecord2725() {
		assertEquals("513-366-1126", customers.get(2724).getFax());
	}

	@Test
	@DisplayName("Record 2725: Email is dawn@baydal.com")
	void EmailOfRecord2725() {
		assertEquals("dawn@baydal.com", customers.get(2724).getEmail());
	}

	@Test
	@DisplayName("Record 2725: Web is http://www.dawnbaydal.com")
	void WebOfRecord2725() {
		assertEquals("http://www.dawnbaydal.com", customers.get(2724).getWeb());
	}
}
