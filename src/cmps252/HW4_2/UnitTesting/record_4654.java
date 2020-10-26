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

@Tag("1")
class Record_4654 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4654: FirstName is Jefferson")
	void FirstNameOfRecord4654() {
		assertEquals("Jefferson", customers.get(4653).getFirstName());
	}

	@Test
	@DisplayName("Record 4654: LastName is Danesi")
	void LastNameOfRecord4654() {
		assertEquals("Danesi", customers.get(4653).getLastName());
	}

	@Test
	@DisplayName("Record 4654: Company is Markinetics Inc")
	void CompanyOfRecord4654() {
		assertEquals("Markinetics Inc", customers.get(4653).getCompany());
	}

	@Test
	@DisplayName("Record 4654: Address is 720 3rd Ave  #-1800")
	void AddressOfRecord4654() {
		assertEquals("720 3rd Ave  #-1800", customers.get(4653).getAddress());
	}

	@Test
	@DisplayName("Record 4654: City is Seattle")
	void CityOfRecord4654() {
		assertEquals("Seattle", customers.get(4653).getCity());
	}

	@Test
	@DisplayName("Record 4654: County is King")
	void CountyOfRecord4654() {
		assertEquals("King", customers.get(4653).getCounty());
	}

	@Test
	@DisplayName("Record 4654: State is WA")
	void StateOfRecord4654() {
		assertEquals("WA", customers.get(4653).getState());
	}

	@Test
	@DisplayName("Record 4654: ZIP is 98104")
	void ZIPOfRecord4654() {
		assertEquals("98104", customers.get(4653).getZIP());
	}

	@Test
	@DisplayName("Record 4654: Phone is 206-623-6190")
	void PhoneOfRecord4654() {
		assertEquals("206-623-6190", customers.get(4653).getPhone());
	}

	@Test
	@DisplayName("Record 4654: Fax is 206-623-5871")
	void FaxOfRecord4654() {
		assertEquals("206-623-5871", customers.get(4653).getFax());
	}

	@Test
	@DisplayName("Record 4654: Email is jefferson@danesi.com")
	void EmailOfRecord4654() {
		assertEquals("jefferson@danesi.com", customers.get(4653).getEmail());
	}

	@Test
	@DisplayName("Record 4654: Web is http://www.jeffersondanesi.com")
	void WebOfRecord4654() {
		assertEquals("http://www.jeffersondanesi.com", customers.get(4653).getWeb());
	}
}
