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

@Tag("16")
class Record_344 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 344: FirstName is Billie")
	void FirstNameOfRecord344() {
		assertEquals("Billie", customers.get(343).getFirstName());
	}

	@Test
	@DisplayName("Record 344: LastName is Conboy")
	void LastNameOfRecord344() {
		assertEquals("Conboy", customers.get(343).getLastName());
	}

	@Test
	@DisplayName("Record 344: Company is Madrid, Emma Pena Esq")
	void CompanyOfRecord344() {
		assertEquals("Madrid, Emma Pena Esq", customers.get(343).getCompany());
	}

	@Test
	@DisplayName("Record 344: Address is 715 Cottage St")
	void AddressOfRecord344() {
		assertEquals("715 Cottage St", customers.get(343).getAddress());
	}

	@Test
	@DisplayName("Record 344: City is Ashland")
	void CityOfRecord344() {
		assertEquals("Ashland", customers.get(343).getCity());
	}

	@Test
	@DisplayName("Record 344: County is Ashland")
	void CountyOfRecord344() {
		assertEquals("Ashland", customers.get(343).getCounty());
	}

	@Test
	@DisplayName("Record 344: State is OH")
	void StateOfRecord344() {
		assertEquals("OH", customers.get(343).getState());
	}

	@Test
	@DisplayName("Record 344: ZIP is 44805")
	void ZIPOfRecord344() {
		assertEquals("44805", customers.get(343).getZIP());
	}

	@Test
	@DisplayName("Record 344: Phone is 419-281-0497")
	void PhoneOfRecord344() {
		assertEquals("419-281-0497", customers.get(343).getPhone());
	}

	@Test
	@DisplayName("Record 344: Fax is 419-281-9704")
	void FaxOfRecord344() {
		assertEquals("419-281-9704", customers.get(343).getFax());
	}

	@Test
	@DisplayName("Record 344: Email is billie@conboy.com")
	void EmailOfRecord344() {
		assertEquals("billie@conboy.com", customers.get(343).getEmail());
	}

	@Test
	@DisplayName("Record 344: Web is http://www.billieconboy.com")
	void WebOfRecord344() {
		assertEquals("http://www.billieconboy.com", customers.get(343).getWeb());
	}
}
