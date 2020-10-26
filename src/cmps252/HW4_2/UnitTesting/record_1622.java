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

@Tag("33")
class Record_1622 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1622: FirstName is Elvira")
	void FirstNameOfRecord1622() {
		assertEquals("Elvira", customers.get(1621).getFirstName());
	}

	@Test
	@DisplayName("Record 1622: LastName is Matushevsky")
	void LastNameOfRecord1622() {
		assertEquals("Matushevsky", customers.get(1621).getLastName());
	}

	@Test
	@DisplayName("Record 1622: Company is Sullivan, Henry G Jr")
	void CompanyOfRecord1622() {
		assertEquals("Sullivan, Henry G Jr", customers.get(1621).getCompany());
	}

	@Test
	@DisplayName("Record 1622: Address is 2180 N Loop W  #-300")
	void AddressOfRecord1622() {
		assertEquals("2180 N Loop W  #-300", customers.get(1621).getAddress());
	}

	@Test
	@DisplayName("Record 1622: City is Houston")
	void CityOfRecord1622() {
		assertEquals("Houston", customers.get(1621).getCity());
	}

	@Test
	@DisplayName("Record 1622: County is Harris")
	void CountyOfRecord1622() {
		assertEquals("Harris", customers.get(1621).getCounty());
	}

	@Test
	@DisplayName("Record 1622: State is TX")
	void StateOfRecord1622() {
		assertEquals("TX", customers.get(1621).getState());
	}

	@Test
	@DisplayName("Record 1622: ZIP is 77018")
	void ZIPOfRecord1622() {
		assertEquals("77018", customers.get(1621).getZIP());
	}

	@Test
	@DisplayName("Record 1622: Phone is 713-957-1206")
	void PhoneOfRecord1622() {
		assertEquals("713-957-1206", customers.get(1621).getPhone());
	}

	@Test
	@DisplayName("Record 1622: Fax is 713-957-3573")
	void FaxOfRecord1622() {
		assertEquals("713-957-3573", customers.get(1621).getFax());
	}

	@Test
	@DisplayName("Record 1622: Email is elvira@matushevsky.com")
	void EmailOfRecord1622() {
		assertEquals("elvira@matushevsky.com", customers.get(1621).getEmail());
	}

	@Test
	@DisplayName("Record 1622: Web is http://www.elviramatushevsky.com")
	void WebOfRecord1622() {
		assertEquals("http://www.elviramatushevsky.com", customers.get(1621).getWeb());
	}
}
